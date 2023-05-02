package com.example.monuments_pro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.start)

        btn.setOnClickListener {
            intent = Intent(applicationContext,Searching::class.java)
            startActivity(intent)
        }
    }
}