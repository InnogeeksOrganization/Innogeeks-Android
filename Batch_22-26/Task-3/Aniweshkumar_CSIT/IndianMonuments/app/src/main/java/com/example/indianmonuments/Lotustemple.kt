package com.example.indianmonuments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lotustemple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotustemple)

        val buttongallery = findViewById<Button>(R.id.btngallery)
        val buttonbook = findViewById<Button>(R.id.btnbook)
        val buttonwebpage = findViewById<Button>(R.id.btnread)

        buttongallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.gettyimages.in/photos/lotus-temple")
            startActivity(intent)
        }

        buttonwebpage.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Lotus_Temple")
            startActivity(intent)
        }
        buttonbook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.yatra.com/utilities/temple/lotus-temple-new-delhi")
            startActivity(intent)
        }
    }
}