package com.example.monumentsproject

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSupportActionBar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var taj = findViewById<ImageView>(R.id.iv1)
        var fort = findViewById<ImageView>(R.id.iv3)
        taj.setOnClickListener {
            intent = Intent(applicationContext, Taj_Options::class.java)
            startActivity(intent)
            Toast.makeText(this,"Exploring Taj", Toast.LENGTH_LONG).show()
        }

        fort.setOnClickListener {
            intent = Intent(applicationContext, fortOptions::class.java)
            startActivity(intent)
            Toast.makeText(this,"Exploring Red Fort", Toast.LENGTH_LONG).show()
        }
    }
}