package com.example.practicfragmentdatabaseeasy.Model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class WordModel(
    val word:String,
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0

)
