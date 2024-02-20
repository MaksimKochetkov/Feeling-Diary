package com.example.feeling_diary
import retrofit2.Call
import retrofit2.http.GET

    interface FeelInterface {
        @GET("quotes")
        fun getImage(): Call<data>
    }
