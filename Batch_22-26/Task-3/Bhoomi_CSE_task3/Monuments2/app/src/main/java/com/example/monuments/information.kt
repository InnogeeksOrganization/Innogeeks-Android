package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class information : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information2)
        val webbutton=findViewById<Button>(R.id.button)
        webbutton.setOnClickListener {


            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/pDyZp8GamonpncHM7"));
            startActivity(intent);

        }
    }
}

