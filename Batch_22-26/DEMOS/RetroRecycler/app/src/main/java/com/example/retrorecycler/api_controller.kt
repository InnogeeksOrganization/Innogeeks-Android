package com.example.retrorecycler

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Objects


class api_controller {

    companion object{
        //AS WE DISCUSSED, THE COMPANION OBJECT IS JUST THE KOTLIN REPLACEMENT FOR 'STATIC' KEYWORD IN JAVA.
        // BASICALLY IT ALLOWS TO CALL FUNCTIONS AND VARIABLES WITHOUT OBJECT CREATION
        val baseUrl = "https://api.imgflip.com/"


        //NOW AS FOR WHAT IS SINGLETON IS AND WHY?
        //CONNECTING BACK TO OUR ROAD EXAMPLE IN CLASS , CONSIDERING OUR RETROFIT HERE AS A ROAD , A PATH TO OUR DESTINATION i.e. OUR API .
        // NOW IF TWO DIFFERENT FARMERS NEED TO SEND THERE GOODS TO THE DESTINATION THEY WOULD JUST REUSE THE ROAD INSTEAD OF CREATING NEW ROADS FOR EACH FARMER .

        //SIMILARLY SINGLETON PATTERN IS A PRACTICE THAT DOESN'T ALLOW THE CREATION OF SEVERAL INSTANCE OF A CLASS FOR THE SAME PURPOSE because IT SAVES RESOURCES
        //THUS, HERE WE WANT TO CREATE OUR 'val retrofit' JUST ONCE AND IT CAN BE REUSED AS MANY NO. OF TIMES IN CASES LIKE MULTIPLE API_SERVICES (OR API_INTERFACES) OR WHEN THE ACTIVITY RESETS WITHOUT CLOSING THE APP.
        // THEREFORE WE CREATE WHAT IS CALLED A 'SINGLETON INSTANCE'

    val retrofit : Retrofit by lazy {
        //HERE WE HAVE USED THE 'lazy' KEYWORD WHICH BASICALLY CHECKS THAT IF THE INSTANCE HAS BEEN CREATED BEFORE AND IF ITS BEEN CREATED IT JUST SUPPLIES THE LAST CREATED VALUES
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
        /*
       As you can see the syntax of lazy is pretty similar to out old syntax :
       val retrofit : Retrofit = Retrofit.Builder()
           .baseUrl(baseUrl)
           .addConverterFactory(GsonConverterFactory.create())
           .build()

      But instead of '=' we use 'by lazy' and the L.H.S goes in {}
      if retrofit has never been created that our app has just begun then
      retrofit variable == null
      thus lazy checks if its null then it assigns the value given in {}
      else it just provides the current value without executing the Retrofit.Builder()... code twice
      thus saving us from multiple instances
        */
        
    }
}

