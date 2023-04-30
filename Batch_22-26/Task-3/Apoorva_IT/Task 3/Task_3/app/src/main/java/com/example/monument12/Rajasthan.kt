package com.example.monument12

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rajasthan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rajasthan)
        val hawabook: Button =findViewById(R.id.hawabook)

        hawabook.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.hawa-mahal.com/tourist-composite-ticket/")

            startActivity(openURL)
        }
    }
}