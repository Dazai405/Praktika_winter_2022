package com.example.mengambilpil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton

class add_pill_1screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_pill1screen)

    var PillName: String = "" //переменная названия лекарства
    var SingleDose: Float //переменная разовой дозы
    var Comment: String? = null //переменная комментария


    }
    fun AddPill2Screen(view: View) {
        val AddPill2ScreenIntent = Intent (this, add_pill_2screen::class.java)
        startActivity(AddPill2ScreenIntent)
    }
    fun BackButton1(view: View) {
        val BackButton1Intent = Intent (this, MainActivity::class.java)
        startActivity(BackButton1Intent)
    }
}