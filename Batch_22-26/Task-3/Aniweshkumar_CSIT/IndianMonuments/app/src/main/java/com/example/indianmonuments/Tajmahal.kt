package com.example.indianmonuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tajmahal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tajmahal)

        val buttongallery = findViewById<Button>(R.id.btngallery)
        val buttonbook = findViewById<Button>(R.id.btnbook)
        val buttonwebpage = findViewById<Button>(R.id.btnread)

        buttongallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.gettyimages.in/photos/taj-mahal")
            startActivity(intent)
        }

        buttonwebpage.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Taj_Mahal")
            startActivity(intent)
        }
        buttonbook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.yatra.com/monuments/details?monumentID=ASI_c632aef9-5c4f-44a4-89cc-697ef17457d0")
            startActivity(intent)
        }
    }
}