package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn1 :Button = findViewById(R.id.button1)
        val duration = Toast.LENGTH_SHORT
        btn1.setOnClickListener {
            Toast.makeText(this,"Login Success",duration).show()
        }
    }
}