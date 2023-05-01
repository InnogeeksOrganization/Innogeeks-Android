package com.example.monuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class informationaboutpremmandir : AppCompatActivity() {
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informationaboutpremmandir)
        val webbutton = findViewById<Button>(R.id.button2)
        webbutton.setOnClickListener {


            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/8q7Py1mLmMttEQ8n6"));
            startActivity(intent);
        }
    }
}