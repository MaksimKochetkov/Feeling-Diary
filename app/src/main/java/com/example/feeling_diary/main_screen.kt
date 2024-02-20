package com.example.feeling_diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit

lateinit var rv: RecyclerView
lateinit var text: TextView
class main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
//        val feel: RecyclerView = findViewById((R.id.recycle))
//        feel.adapter = Feel_adapter(this, Feel_list().list)
        rv = findViewById(R.id.recycle)
        val retrofit = RetrofitClass().getRetrofit()
        val api_ret = retrofit.create(FeelInterface::class.java)
        val retr_call: Call<data> = api_ret.getImage()
        retr_call.enqueue(object:retrofit2.Callback<data> {
            override fun onResponse(call: Call<data>, response: Response<data>) {
                if(response.isSuccessful) {
                    rv.adapter = response.body()?.let{ Feel_adapter(applicationContext, it.data) }
                }
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                Toast.makeText(applicationContext, "ОШИБКА", Toast.LENGTH_SHORT).show()
            }

        })

        val news: RecyclerView = findViewById((R.id.recyclenews))
        news.adapter = News_adapter(this, News_list().list)

    }
}