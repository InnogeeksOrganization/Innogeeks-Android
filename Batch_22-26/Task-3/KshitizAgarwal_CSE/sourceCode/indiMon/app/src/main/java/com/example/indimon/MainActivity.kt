package com.example.indimon

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val tajTxt:TextView =findViewById(R.id.textView2)
//        val bookingBtn:Button = findViewById(R.id.bookTaj)
        val link: String = "https://asi.payumoney.com/quick/taj"
        val rightArrow: ImageButton = findViewById(R.id.rightArrow)
        val leftArrow: ImageButton = findViewById((R.id.leftArrow))
//        val tajBtn: Button = findViewById(R.id.tajBtn)
        val qutubMinar = qutubMinarFragment()
        val agraFort = agraFort()
        val tajFragment = tajFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFragment, tajFragment)
            commit()
            addToBackStack(null)
        }


        rightArrow.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFragment, qutubMinar, "currentQutub")
                commit()
                addToBackStack(null)
            }
        }


        leftArrow.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.mainFragment, agraFort)
                commit()
                addToBackStack(null)
            }
//
//            val mainFragment:FrameLayout
//            if(mainFragment ==supportFragmentManager.findFragmentByTag("currentQutub")){
//                leftArrow.setOnClickListener {
//                supportFragmentManager.beginTransaction().apply {
//                    replace(R.id.mainFragment, agraFort)
//                    commit()
//                }
//            }
////            }
//        tajBtn.setOnClickListener {
//            val intent =  Intent(Intent.ACTION_VIEW, Uri.parse(link))
//            startActivity(intent)
//        }

//        if(R.id.mainFragment == qutubMinar){
//            leftArrow.setOnClickListener {
//                supportFragmentManager.beginTransaction().apply {
//                    replace(R.id.mainFragment, agraFort)
//                    commit()
//                }
//            }
//        }
        }
    }
}

