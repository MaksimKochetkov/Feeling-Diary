package com.example.feeling_diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.regex.Pattern

class signin : AppCompatActivity() {
    val pattern = ("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\." + "[a-z]{1,3}")
    lateinit var email: EditText
    lateinit var pass: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        email = findViewById(R.id.edittextemail)
        pass = findViewById(R.id.edittextpass)
    }
    fun emailValid(text:String):Boolean
    {
        return Pattern.compile(pattern).matcher(text).matches()
    }
    fun but(view: View) {
        if (email.text.toString().isEmpty()||pass.text.toString().isEmpty()) {
            Toast.makeText(this, "Что-то пусто", Toast.LENGTH_SHORT).show()
        }
        if (email.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            Toast.makeText(this, "Регистеренко успешно", Toast.LENGTH_LONG).show()
            if (emailValid(email.text.toString()))
            {
                val intent = Intent(this@signin, main_screen::class.java)
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show()
            }
        }
        else {
            val alert = AlertDialog.Builder(this)
        }
    }
}