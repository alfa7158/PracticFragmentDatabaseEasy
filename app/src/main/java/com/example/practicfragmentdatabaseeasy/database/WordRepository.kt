package com.example.practicfragmentdatabaseeasy.database

import android.content.Context
import androidx.room.Room
import com.example.practicfragmentdatabaseeasy.Model.WordModel
import java.lang.Exception

private const val DATABASE_NAME = "word"

class WordRepository(context: Context) {
    private val database:WordDatabase = Room.databaseBuilder(context,
        WordDatabase::class.java,DATABASE_NAME).
    fallbackToDestructiveMigration().build()
    private val wordDao:WordDao = database.wordDao()

    fun getItems() = wordDao.getItem()
    suspend fun addWord(wordModel: WordModel) = wordDao.addWord(wordModel)

    companion object{
        private var instance:WordRepository? = null

        fun init(context: Context){
            /// assign instance if not null
            if(instance==null){
                instance = WordRepository(context)

            }

        }


        //gets the object
        fun get():WordRepository{

            return instance?:throw Exception("Word Repository must be initialized")
        }

    }

}