package com.example.mengambilpil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //кнопка добавить лекарство
    fun AddPill1Screen(view: View) {
        val AddPill1ScreenIntent = Intent (this, add_pill_1screen::class.java)
        startActivity(AddPill1ScreenIntent)
    }
}

