package com.example.monuments_pro

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.SearchView

class Searching : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searching)

        val found = findViewById<EditText>(R.id.Search)
        val click = findViewById<Button>(R.id.btn5)
        val monument = findViewById<Button>(R.id.btn1)
        val location = findViewById<Button>(R.id.btn2)
        val hotel = findViewById<Button>(R.id.btn3)

        click.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/search?")
            startActivity(intent)
        }

        monument.setOnClickListener {
           intent = Intent(applicationContext,Monuments::class.java)
            startActivity(intent)
        }

        location.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/maps/@28.7536971,77.5045989,15z")
            startActivity(intent)
        }

        hotel.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.oyorooms.com/")
            startActivity(intent)
        }



    }
}