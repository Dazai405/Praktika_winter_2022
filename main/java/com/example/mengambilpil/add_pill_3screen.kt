package com.example.mengambilpil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

class add_pill_3screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_pill3screen)

    var PillUnit: Int = 0 // переменная означающ. появление таблетки
    var TakeDay: Short = 0 // перемена дней према (каждый день, через день и тд)
    var StartDate: Int = 0 // Переменная первого дня приема
    var EndDate: Int = 0 //переменная последнего дня приема
    var Duration: Int = 0 // переменная длительности

    }

    //кнопки переходов на другие экраны
    //с этого экрана на следующий (кнопка далее)
    fun AddPill4Button(view: View) {
        val AddPill4ScreenIntent = Intent(this, MainActivity::class.java)
        startActivity(AddPill4ScreenIntent)
    }

    //с этого экрана на предыдущий (кнопка назад)
    fun BackButton3(view: View) {
        val BackButton3Intent = Intent(this, add_pill_2screen::class.java)
        startActivity(BackButton3Intent)
    }

    //с этого экрана на начальный (кнопка Х)
    fun MainFrameButton(view: View) {
        val MainFrameButtonIntent = Intent(this, MainActivity::class.java)
        startActivity(MainFrameButtonIntent)
    }
}