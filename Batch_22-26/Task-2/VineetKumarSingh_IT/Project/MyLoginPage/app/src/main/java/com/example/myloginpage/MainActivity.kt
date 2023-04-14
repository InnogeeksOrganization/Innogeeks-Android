package com.example.myloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<TextView>(R.id.username)
        val password = findViewById<TextView>(R.id.password_toggle)
        val btn1 = findViewById<MaterialButton>(R.id.loginbtn)
        btn1.setOnClickListener{
            val toast = Toast.makeText(this, "Login is attempted",Toast.LENGTH_LONG)
            toast.show()

        }
    }
}