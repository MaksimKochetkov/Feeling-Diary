package com.example.feeling_diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val feel: RecyclerView = findViewById((R.id.recycle))
        feel.adapter = Feel_adapter(this, Feel_list().list)
        val news: RecyclerView = findViewById((R.id.recyclenews))
        news.adapter = News_adapter(this, News_list().list)

    }
}