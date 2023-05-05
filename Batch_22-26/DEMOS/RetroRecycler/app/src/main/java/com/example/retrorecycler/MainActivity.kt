package com.example.retrorecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val retrofitService = api_controller.getInstance()
       val retrfitdata = retrofitService.getMemes()
       retrfitdata.enqueue(object : retrofit2.Callback<ResponseModel> {

           override fun onResponse( call: Call<ResponseModel>, response: Response<ResponseModel> ) {
               val responseBody = response.body()
               val list : List<Meme> = responseBody!!.data.memes
               val recyclerView : RecyclerView = findViewById(R.id.recycle)
               recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
               recyclerView.adapter = myAdapter(this@MainActivity, list )
           }

           override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
           }
       })









    }
}