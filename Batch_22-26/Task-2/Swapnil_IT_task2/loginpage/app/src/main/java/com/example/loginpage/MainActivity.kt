package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonlogin= findViewById<Button>(R.id.button1)
        buttonlogin.setOnClickListener{
            Toast.makeText(applicationContext, "login successfully", Toast.LENGTH_SHORT).show()
        }
    }
}
