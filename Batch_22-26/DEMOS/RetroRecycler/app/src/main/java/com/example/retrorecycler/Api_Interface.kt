package com.example.retrorecycler

import retrofit2.Call
import retrofit2.http.GET

interface Api_Interface {

    @GET("get_memes")
    fun getMemes() : Call<ResponseModel>
}