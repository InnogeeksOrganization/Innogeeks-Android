package com.example.retrorecycler

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class api_controller
{

    companion object {
        fun getInstance(): Api_Interface  {

            val baseUrl = "https://api.imgflip.com/"
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Api_Interface::class.java)
        }
    }
}