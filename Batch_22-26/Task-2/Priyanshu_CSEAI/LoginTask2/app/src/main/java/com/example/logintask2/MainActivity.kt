package com.example.logintask2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener{
          callactivity()
        }
    }
    private fun callactivity(){
        val editText = findViewById<EditText>(R.id.edittext)
        val message = editText.text.toString()
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}