package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     private EditText nameText,ageText;
     private Button button;
     private String name;
     private int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.Personme);
        ageText = findViewById(R.id.PersonName2);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search();
            }
        });
    }
    public void search()
    {
       name = nameText.getText().toString().trim();
       age = Integer.parseInt(ageText.getText().toString().trim());

        Intent i = new Intent(MainActivity.this,activity1.class);

        i.putExtra(activity1.NAME,name);
        i.putExtra(activity1.AGE,age);

        startActivity(i);
    }
}