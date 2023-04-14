package com.example.roadbud;

import static android.content.Context.SENSOR_SERVICE;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Dashboard#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Dashboard extends Fragment implements SensorEventListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private LineChart accChart;
    private SensorManager sensorManager;
    private TextView tv_accmeter;
    private TextView tv_welcome;
    private float gForce=0;
    private Thread thread;
    private boolean plotData = true;

    boolean flag = true;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Dashboard() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Dashboard.
     */
    // TODO: Rename and change types and number of parameters
    public static Dashboard newInstance(String param1, String param2) {
        Dashboard fragment = new Dashboard();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dashboard, container, false);
        Toolbar toolbar = view.findViewById(R.id.toolbar_dashboard);
        accChart = view.findViewById(R.id.accelerometerChart);
        tv_accmeter = view.findViewById(R.id.tv_accmeter);
        tv_welcome = view.findViewById(R.id.tv_welcome);

        //Toolbar
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);

        //Sensor
         sensorManager = (SensorManager) getActivity().getSystemService(SENSOR_SERVICE);
         if(sensorManager!=null){
             Sensor accMeter = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
             if(accMeter!=null){
                 sensorManager.registerListener(this,accMeter,SensorManager.SENSOR_DELAY_UI);
             }
            else{
                 Toast.makeText(getActivity(),"Sensor Service Unavailable",Toast.LENGTH_SHORT).show();
             }
         }
         else {
             Toast.makeText(getActivity(),"Sensor Service Unavailable",Toast.LENGTH_SHORT).show();
         }

        //Chart for accelerometer
        accChart.getDescription().setEnabled(true);
        accChart.getDescription().setText("Accelerometer");
        accChart.setNoDataText("No Data for the moment");
        accChart.setHighlightPerTapEnabled(false);
        accChart.setTouchEnabled(false);
        accChart.setDragEnabled(false);
        accChart.setScaleEnabled(false);
        accChart.setDrawGridBackground(false);
        accChart.setPinchZoom(false);
        accChart.setBackgroundColor(Color.BLACK);

        LineData data = new LineData();
        data.setValueTextColor(Color.WHITE);
        accChart.setData(data);

        Legend l = accChart.getLegend();

        l.setForm(Legend.LegendForm.LINE);
        l.setTextColor(Color.WHITE);

        XAxis x1 = accChart.getXAxis();
        x1.setTextColor(Color.WHITE);
        x1.setDrawGridLines(false);
        x1.setAvoidFirstLastClipping(false);
        x1.setEnabled(true);

        YAxis y1 = accChart.getAxisLeft();
        y1.setTextColor(Color.WHITE);
        y1.setAxisMaximum(10.0f);
        y1.setAxisMinimum(0f);
        y1.setDrawGridLines(false);

        YAxis y12 = accChart.getAxisRight();
        y12.setEnabled(false);

        accChart.setDrawBorders(false);

        startPlot();
        return  view;
    }

    private void startPlot(){
        if(thread!=null){
            thread.interrupt();
        }
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    plotData = true;
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    public void addEntry(SensorEvent sensorEvent){

        LineData data = accChart.getData();
        float x = sensorEvent.values[0];
        float y = sensorEvent.values[1];
        float z = sensorEvent.values[2];
        gForce = ((float) Math.sqrt(x*x +y*y +z*z))/9.8f;
        if(gForce>=5.0 && flag){
            startActivity(new Intent(getActivity(),PostCrash.class));
            flag = false;
            getActivity().finish();
        }
        tv_accmeter.setText("X: "+x+" Y: "+y+" Z: "+z+", GForce: "+gForce);
        if(data!=null){
            ILineDataSet set = data.getDataSetByIndex(0);
            if(set==null){
                set = createSet();
                data.addDataSet(set);
            }
            data.addEntry(new Entry(set.getEntryCount(),gForce),0);
            accChart.notifyDataSetChanged();
            accChart.setVisibleXRange(0,40);
            accChart.moveViewToX(data.getEntryCount()-20);

        }
    }
    private LineDataSet createSet(){
        LineDataSet set = new LineDataSet(null,"Dynamic Data");
        set.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        set.setCubicIntensity(0.2f);
        set.setAxisDependency(YAxis.AxisDependency.LEFT);
        set.setColor(ColorTemplate.getHoloBlue());
        set.setLineWidth(2f);
       return  set;

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.dashboard_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu_feedback:
                startActivity(new Intent(getActivity(),Feedback.class));
                break;
            case R.id.menu_about:
                startActivity(new Intent(getActivity(),About.class));
                break;
            case R.id.menu_logout:
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("userPref", Context.MODE_PRIVATE);
                sharedPreferences.edit().clear().commit();
                startActivity(new Intent(getActivity(),Login_Screen.class));
                getActivity().finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_ACCELEROMETER && plotData){
            addEntry(sensorEvent);
            plotData = false;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        sensorManager.unregisterListener(this);
        thread.interrupt();
        super.onDestroy();
    }
}