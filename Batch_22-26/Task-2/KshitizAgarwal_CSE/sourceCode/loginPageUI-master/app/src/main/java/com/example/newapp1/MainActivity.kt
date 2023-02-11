package com.example.newapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn: Button = findViewById(R.id.button_acc)
        btn.setOnClickListener {
            Toast.makeText(this, "KAl AANA BHAI", Toast.LENGTH_SHORT).show()
        }
        var imgbtn: ImageButton = findViewById(R.id.google)
        imgbtn.setOnClickListener {
                Toast.makeText(this, "google", Toast.LENGTH_SHORT).show()
        }
            var imgbtn2: ImageButton = findViewById(R.id.facebook)
            imgbtn2.setOnClickListener {
                Toast.makeText(this, "facebook", Toast.LENGTH_SHORT).show()
            }
                var imgbtn3: ImageButton = findViewById(R.id.github)
                imgbtn3.setOnClickListener {
                    Snackbar.make(it,"github",Snackbar.LENGTH_SHORT).show()
                }

    }
}