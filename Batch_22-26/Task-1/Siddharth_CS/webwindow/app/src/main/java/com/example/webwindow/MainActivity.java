package com.example.webwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                    //correct
                    Toast.makeText(MainActivity.this,  "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT ).show();
                    else
                        //incorrect
                    Toast.makeText(MainActivity.this,  "LOGIN FAILED !!!", Toast.LENGTH_SHORT ).show();
            }
        });

    }
}