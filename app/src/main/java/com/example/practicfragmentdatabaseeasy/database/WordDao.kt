package com.example.practicfragmentdatabaseeasy.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.practicfragmentdatabaseeasy.Model.WordModel

@Dao
interface WordDao {
    @Insert
    suspend fun addWord(itemMode:WordModel)
    @Query("SELECT * FROM wordmodel")
    fun getItem(): LiveData<List<WordModel>>




}