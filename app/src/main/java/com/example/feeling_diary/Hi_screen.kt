package com.example.feeling_diary

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Hi_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_screen)
        val myIntent = Intent(this@Hi_screen, main_screen::class.java)
        myIntent.putExtra("go_to_recycle", value)

        this@Hi_screen.startActivity(myIntent)
    }
}