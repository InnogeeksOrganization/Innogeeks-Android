package com.example.indianmounument

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.indianmounument.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.location4.setOnClickListener {
         val   intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/maps/d/viewer?mid=12-NDt1PXsR23jR2uMTT_-xk6zRw&hl=en_US&ll=27.170551000000003%2C78.04202600000002&z=17")
            startActivity(intent)
        }
        binding.location.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/maps/d/viewer?mid=1JYjVM10Dz7g_C1vGLgm_bNrIjKU&hl=en&ll=28.65632360106686%2C77.24080149999999&z=16")
            startActivity(intent)
        }
        binding.location6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/maps/place/Hawa+Mahal/@26.9239363,75.8267438,17z/data=!3m1!4b1!4m6!3m5!1s0x396db14b1bd30ba5:0x860e5d531eccb20c!8m2!3d26.9239363!4d75.8267438!16zL20vMDZrN3Fj")
            startActivity(intent)
        }
        binding.ticket.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://asi.payumoney.com/quick/red")
            startActivity(intent)
        }
        binding.ticket4.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tajmahal.gov.in/ticketing.aspx")
            startActivity(intent)
        }
        binding.location6.setOnClickListener{
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.hawa-mahal.com/tourist-composite-ticket")
            startActivity(intent)

        }
        binding.ticket5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.readermaster.com/ram-mandir-ayodhya-online-darshan-booking/")
            startActivity(intent)
        }
        binding.location5.setOnClickListener{
        val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.google.com/maps/dir//Q5RX%2BVX6+Ram+mandir,+New+Colony,+Ayodhya,+Uttar+Pradesh+224123/@26.7986961,82.1907827,15z/data=!4m8!4m7!1m0!1m5!1m1!1s0x399a07c4f58cb42d:0x88547653a4a8e8e1!2m2!1d82.1999039!2d26.7921511")

        }
        binding.tajImage.setOnClickListener {
        intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}