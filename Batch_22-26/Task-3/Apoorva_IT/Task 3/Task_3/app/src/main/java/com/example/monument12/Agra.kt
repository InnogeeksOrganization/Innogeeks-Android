package com.example.monument12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Agra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agra)
        val tajbook:Button=findViewById(R.id.tajbook)

            tajbook.setOnClickListener {
                val openURL= Intent(android.content.Intent.ACTION_VIEW)
                openURL.data= Uri.parse("https://www.tajmahal.gov.in/ticketing.aspx")

                startActivity(openURL)
        }
    }
}