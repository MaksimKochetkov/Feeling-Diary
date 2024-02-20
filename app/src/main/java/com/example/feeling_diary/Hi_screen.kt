package com.example.feeling_diary

import android.R.attr.value
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.feeling_diary.R.id.edittextemail
import com.example.feeling_diary.R.id.edittextpass
import java.util.regex.Pattern


class Hi_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_screen)

    }

    fun go_to_recycle(view: View) {
        val myIntent = Intent(this@Hi_screen, main_screen::class.java)
        myIntent.putExtra("go_to_recycle", value)
        this@Hi_screen.startActivity(myIntent)}

    fun go_to_sign(view: View) {
    val my1Intent = Intent(this@Hi_screen, signin::class.java)
    my1Intent.putExtra("go_to_sign", value)
    this@Hi_screen.startActivity(my1Intent)}
}