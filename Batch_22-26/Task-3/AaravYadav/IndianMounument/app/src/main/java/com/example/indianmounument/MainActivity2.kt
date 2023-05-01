package com.example.indianmounument

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val taj = findViewById<TextView>(R.id.tajmahal)
        taj.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://unsplash.com/s/photos/taj-mahal")
            startActivity(intent)
        }
    }
}