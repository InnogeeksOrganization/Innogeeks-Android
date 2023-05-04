package com.example.indiamonument

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private fun new1() {
        intent= Intent(this,charminar::class.java)
        startActivity(intent)


    }



    private fun new2() {

        intent= Intent(this,goldentempple::class.java)
        startActivity(intent)

    }



    private fun new3() {

        intent= Intent(this,qutubminar::class.java)
        startActivity(intent)


    }

    private fun new4() {
        intent= Intent(this,hawamahal::class.java)
        startActivity(intent)


    }

    private fun new5() {

        intent= Intent(this,redfort::class.java)
        startActivity(intent)



    }

    private fun new6() {

        intent= Intent(this,tajmahal::class.java)
        startActivity(intent)



    }


    private fun nextpage() {
        intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)

        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<ImageButton>(R.id.button1)
        button1.setOnClickListener {
            new1()

        }
        val button2 = findViewById<ImageButton>(R.id.button2)
        button2.setOnClickListener {
            new2()
        }


        val button3=findViewById<ImageButton>(R.id.button3)
        button3.setOnClickListener {
            new3()}
        val button4=findViewById<ImageButton>(R.id.button4)
        button4.setOnClickListener {
            new4()
        }

        val button5 =findViewById<ImageButton>(R.id.Button5)
        button5.setOnClickListener {
            new5()

        }
        val button6=findViewById<ImageButton>(R.id.button6)
        button6.setOnClickListener {
            new6()
        }




        val imagebuttonr=findViewById<ImageButton>(R.id.imagebuttonr)
        imagebuttonr.setOnClickListener{
            nextpage()
        }
        val imagebuttonh=findViewById<ImageButton>(R.id.imagebuttonh)
        imagebuttonh.setOnClickListener{

            homepage()
        }


    }

    private fun homepage() {
       
        intent=Intent(this,MainActivity0::class.java)
        startActivity(intent)
    }

}



