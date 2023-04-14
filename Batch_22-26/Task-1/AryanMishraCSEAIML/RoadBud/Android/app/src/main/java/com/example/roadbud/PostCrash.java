package com.example.roadbud;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class PostCrash extends AppCompatActivity {
    TextView timer;
    Button cancel,sos;
    CountDownTimer tiktok;
    MediaPlayer siren;
    //Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_crash);

        //Assign variable
        timer = findViewById(R.id.textView);
        cancel = findViewById(R.id.cancelbtn);
        sos = findViewById(R.id.raiseSOS);
        siren = MediaPlayer.create(PostCrash.this,R.raw.siren);
        //vibrator.vibrate(4000);
        siren.start();
        //To stop use : siren.release();

        //Initialize timer duration
        //long duration = TimeUnit.MINUTES.toMillis(1);
        //Initialize countdown timer
        tiktok = new CountDownTimer(10000,  1000) {

            @Override
            public void onTick(long l) {
                //When tick
                //Convert millisecond to minute and second
                String sDuration = String.format(Locale. ENGLISH," %02d:%02d", TimeUnit.MILLISECONDS.toMinutes (l)
                        ,TimeUnit.MILLISECONDS.toSeconds (l) -
                        TimeUnit.MINUTES.toSeconds (TimeUnit.MILLISECONDS.toMinutes (l)));
                 //Set converted string on text view
                timer.setText(sDuration);
                //For I need help button action
                sos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Alerting contacts",Toast.LENGTH_SHORT).show();
                        sendSMS();
                        tiktok.cancel();
                        siren.release();
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        finish();
                    }
                });
                //For cancel button action
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Cancelled",Toast.LENGTH_SHORT).show();
                        tiktok.cancel();
                        siren.release();
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        finish();
                    }
                });

            }
            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Stopped",Toast.LENGTH_SHORT).show();
                siren.release();
                sendSMS();
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            }
        }.start();

              }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tiktok.cancel();
        siren.release();
    }

    private void sendSMS(){
        // TODO: Add message and destination through getText()
        try{
            SmsManager smsManager = SmsManager.getDefault();
            //get string
            smsManager.sendTextMessage("7275676734",null,"Test SOS Message",null,null);

            smsManager.sendTextMessage("6290167736",null,"Test SOS Message",null,null);
            Toast.makeText(getApplicationContext(),"SOS Sent",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"SOS Failed",Toast.LENGTH_SHORT).show();
        }

    }


}