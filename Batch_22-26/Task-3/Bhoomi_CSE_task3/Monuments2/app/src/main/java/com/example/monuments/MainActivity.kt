package com.example.monuments

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.PendingIntent.*
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import com.example.monuments.R.*
import com.google.android.material.bottomnavigation.BottomNavigationView


@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {
    val Channel_id = "channelId"
    val Channel_name = "channelname"
    val Notification_id = 0

    @RequiresApi(Build.VERSION_CODES.S)
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        supportActionBar?.hide()
        // bottom Navigation
        val bottomview = findViewById<BottomNavigationView>(id.bottomnavigation)
        replaceWithFragment(Home())
        bottomview.setOnItemSelectedListener {
            when(it.itemId){
                id.item1 -> replaceWithFragment(Home())
                id.item2 -> replaceWithFragment(Cart())
                id.item3 -> replaceWithFragment(Settings())
                id.item4 -> replaceWithFragment(Profile())
                else ->{
                }
            }
            true
        }

        val imageIntent = findViewById<CardView>(id.taj)
        imageIntent.setOnClickListener {
            intent = Intent(applicationContext, information::class.java);
            startActivity(intent)
        }
        val indiagateintent = findViewById<CardView>(id.indiagate)
        indiagateintent.setOnClickListener {
            intent = Intent(applicationContext, informationaboutindiagate::class.java);
            startActivity(intent)
        }
        val lotusintent = findViewById<CardView>(id.lotustemple)
        lotusintent.setOnClickListener {
            intent = Intent(applicationContext, informationaboutlotustemple::class.java);
            startActivity(intent)
        }
        val pmandirintent = findViewById<CardView>(id.premmandir)

        pmandirintent.setOnClickListener {
            intent = Intent(applicationContext, informationaboutpremmandir::class.java);
            startActivity(intent)
        }

        createNotificationchannel()

        val intent = Intent(applicationContext, Login::class.java);
        val pendingIntent = getActivity(this, 0, intent, PendingIntent.FLAG_MUTABLE)
        val notification = NotificationCompat.Builder(this, Channel_id)
            .setContentTitle("Monuments")
            .setContentText("Login Your Account For More Information")
            .setSmallIcon(drawable.ic_baseline_notifications_24)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()

        val btn = findViewById<Button>(id.Login)
        val notificationManager = NotificationManagerCompat.from(this)
        btn.setOnClickListener {
            notificationManager.notify(Notification_id, notification)
        }
    }

    private fun createNotificationchannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(Channel_id,
                Channel_name,
                NotificationManager.IMPORTANCE_DEFAULT).apply {
                description = "someone message"

            }
            val manager = getSystemService((Context.NOTIFICATION_SERVICE)) as NotificationManager
            manager.createNotificationChannel(channel)
        }


    }
    private fun replaceWithFragment(fragment:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(id.frame, fragment)
        fragmentTransaction.commit()

    }
}

         




// binding  null safe, type conversion
// vie model class ui state  instance  state save kr sakte h,business logic
