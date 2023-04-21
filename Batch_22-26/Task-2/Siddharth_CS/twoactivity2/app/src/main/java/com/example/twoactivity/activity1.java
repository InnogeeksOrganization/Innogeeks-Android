package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity1 extends AppCompatActivity {
public static final String NAME = "NAME";
public static final String AGE = "AGE";
private TextView nameText,ageText;
private String name;
private int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        nameText = findViewById(R.id.nameText);
        ageText = findViewById(R.id.AgeText);

        Intent i = getIntent();
        name = i.getStringExtra(NAME);
        age = i.getIntExtra(AGE,0);

        nameText.setText("Happy Birthday "+name );
        ageText.setText("Enjoy your " +age + "th bday");


    }
}