package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.loginbutton)
        btn.setOnClickListener{
            val toast= Toast.makeText(this,"Kotlin nahi aati abhi", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}