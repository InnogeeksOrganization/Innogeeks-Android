package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class informationaboutindiagate : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informationaboutindiagate)

        val webbutton = findViewById<Button>(R.id.button1)
        webbutton.setOnClickListener {


            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/L9J9v3GF8EWSHFBV9"));
            startActivity(intent);
        }
    }
}
