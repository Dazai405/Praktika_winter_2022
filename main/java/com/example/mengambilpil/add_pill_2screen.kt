package com.example.mengambilpil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class add_pill_2screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_pill2screen)

        //переменные времени приема
    var Take1: Int = 0
    var Take2: Int? = null
    var Take3: Int? = null

    }

    //кнопки переходов на другие экраны
    //с этого экрана на следующий (кнопка далее)
    fun AddPill3Screen(view: View) {
        val AddPill4ScreenIntent = Intent(this, add_pill_3screen::class.java)
        startActivity(AddPill4ScreenIntent)
    }

    //с этого экрана на предыдущий (кнопка назад)
    fun BackButton2(view: View) {
        val BackButton3Intent = Intent(this, add_pill_1screen::class.java)
        startActivity(BackButton3Intent)
    }

    //с этого экрана на начальный (кнопка Х)
    fun MainFrameButton(view: View) {
        val MainFrameButtonIntent = Intent(this, MainActivity::class.java)
        startActivity(MainFrameButtonIntent)
    }
}