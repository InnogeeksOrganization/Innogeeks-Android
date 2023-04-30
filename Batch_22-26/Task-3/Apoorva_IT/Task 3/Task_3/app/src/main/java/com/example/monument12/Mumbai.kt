package com.example.monument12

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mumbai : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mumbai)
        val gatebook: Button =findViewById(R.id.gatebook)

        gatebook.setOnClickListener {
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.viator.com/en-IN/Mumbai-attractions/Gateway-of-India/d953-a4622")

            startActivity(openURL)
        }
    }
}