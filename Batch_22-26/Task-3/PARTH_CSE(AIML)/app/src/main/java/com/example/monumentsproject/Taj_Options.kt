package com.example.monumentsproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Taj_Options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taj_options)

        val ticket = findViewById<ImageView>(R.id.ticket)
        ticket.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tajmahal.gov.in/ticketing.aspx")
            startActivity(intent)
        }

        val about = findViewById<ImageView>(R.id.about)
        about.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Taj_Mahal#:~:text='Crown%20of%20the%20Palace'),tomb%20of%20Shah%20Jahan%20himself.")
            startActivity(intent)
        }

        val contact = findViewById<ImageView>(R.id.contact)
        contact.setOnClickListener {
            intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + 123456789) //change the number
            startActivity(intent)
        }
    }
}