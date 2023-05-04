package com.example.monuments_pro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class Monuments : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monuments)

        val click = findViewById<CardView>(R.id.Click3)
        val click1 = findViewById<CardView>(R.id.Click2)

        click.setOnClickListener {
            intent = Intent(applicationContext, Taj_Mahal::class.java)
            startActivity(intent)
        }

        click1.setOnClickListener {
            intent = Intent(applicationContext, Red_Fort::class.java)
            startActivity(intent)
        }
    }
}