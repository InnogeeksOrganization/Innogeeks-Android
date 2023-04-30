package com.example.monument12

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Delhi : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delhi)
        val delhibook: Button =findViewById(R.id.delhibook)

        delhibook.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://asi.payumoney.com/quick/red")

            startActivity(openURL)
        }
    }
}