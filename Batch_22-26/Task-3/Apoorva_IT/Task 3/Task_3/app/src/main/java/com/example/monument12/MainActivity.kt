package com.example.monument12

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val agra= findViewById<ImageButton>(R.id.agra)
        agra.setOnClickListener {
            val Intent = Intent(this,Agra::class.java)
            startActivity(Intent)}
            val mumbai= findViewById<ImageButton>(R.id.mumbai)
            mumbai.setOnClickListener {
                val Intent = Intent(this,Mumbai::class.java)
                startActivity(Intent)}
                val delhi= findViewById<ImageButton>(R.id.delhi)
                delhi.setOnClickListener {
                    val Intent = Intent(this,Delhi::class.java)
                    startActivity(Intent)}
                    val rajasthan= findViewById<ImageButton>(R.id.rajasthan)
                    rajasthan.setOnClickListener {
                        val Intent = Intent(this,Rajasthan::class.java)
                        startActivity(Intent)
        }
    }

}


