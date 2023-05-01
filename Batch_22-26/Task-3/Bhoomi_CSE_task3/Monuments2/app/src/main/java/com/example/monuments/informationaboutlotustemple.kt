package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class informationaboutlotustemple : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informationaboutlotustemple)
        val webbutton = findViewById<Button>(R.id.button2)
        webbutton.setOnClickListener {


            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/Ggj2Chff998o7FiG6"));
            startActivity(intent);
        }
    }
}