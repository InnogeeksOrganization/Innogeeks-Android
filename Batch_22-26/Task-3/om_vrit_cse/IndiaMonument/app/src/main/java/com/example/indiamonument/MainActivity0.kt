package com.example.indiamonument

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton

class MainActivity0: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)
        val button0 =findViewById<ImageButton>(R.id.button0)
        button0.setOnClickListener {
            next()
        }
    }

    private fun next() {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)

    }
}


