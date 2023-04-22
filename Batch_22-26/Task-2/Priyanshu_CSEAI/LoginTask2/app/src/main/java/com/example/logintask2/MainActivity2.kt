package com.example.logintask2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button12)
        button.setOnClickListener {
            callactivity()
        }
    }

    private fun callactivity() {
        val editText = findViewById<EditText>(R.id.edittext)
        val message = editText.text.toString()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}