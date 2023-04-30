package com.example.indianmonuments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val redfortimg = findViewById<ImageButton>(R.id.redfort)
        val tajmahalimg = findViewById<ImageButton>(R.id.tajmahal)
        val indiagateimg = findViewById<ImageButton>(R.id.indiagate)
        val goldentempleimg = findViewById<ImageButton>(R.id.goldentemple)
        val lotustempleimg = findViewById<ImageButton>(R.id.lotustemple)
        val hawamahalimg = findViewById<ImageButton>(R.id.hawamahal)
        val aksardhamtemplemg = findViewById<ImageButton>(R.id.aksardhamtemple)


        redfortimg.setOnClickListener {
            intent = Intent(applicationContext, Redfort::class.java)
            startActivity(intent)
        }
        tajmahalimg.setOnClickListener {
            intent = Intent(applicationContext, Tajmahal::class.java)
            startActivity(intent)
        }
        indiagateimg.setOnClickListener {
            intent = Intent(applicationContext, Indiagate::class.java)
            startActivity(intent)
        }
        goldentempleimg.setOnClickListener {
            intent = Intent(applicationContext, Goldentemple::class.java)
            startActivity(intent)
        }
        lotustempleimg.setOnClickListener {
            intent = Intent(applicationContext, Lotustemple::class.java)
            startActivity(intent)
        }
        hawamahalimg.setOnClickListener {
            intent = Intent(applicationContext, Hawamahal::class.java)
            startActivity(intent)
        }
        aksardhamtemplemg.setOnClickListener {
            intent = Intent(applicationContext, Aksardhamtemple::class.java)
            startActivity(intent)
        }


    }
}