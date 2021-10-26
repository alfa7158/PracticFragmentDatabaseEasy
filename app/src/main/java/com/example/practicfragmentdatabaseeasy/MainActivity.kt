package com.example.practicfragmentdatabaseeasy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicfragmentdatabaseeasy.database.WordRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        WordRepository.init(this)
    }
}