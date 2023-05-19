package com.example.app_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Actbut1 = findViewById<Button>(R.id.Visit)
        Actbut1.setOnClickListener{
            val Intent = Intent ( this,MainActivity2::class.java)
            startActivity(Intent)
        }
    }
}
