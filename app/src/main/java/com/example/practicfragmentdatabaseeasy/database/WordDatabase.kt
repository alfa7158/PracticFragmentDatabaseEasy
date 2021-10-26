package com.example.practicfragmentdatabaseeasy.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.practicfragmentdatabaseeasy.Model.WordModel

@Database(entities = [WordModel::class],version = 1)
abstract class WordDatabase : RoomDatabase() {
    abstract fun wordDao():WordDao
}