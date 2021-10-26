package com.example.practicfragmentdatabaseeasy.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicfragmentdatabaseeasy.Model.WordModel
import com.example.practicfragmentdatabaseeasy.database.WordRepository
import kotlinx.coroutines.launch

class WordViewModel:ViewModel() {
    //var item: ItemModel? =null

    // to pass the  Repository to the view model
    private val wordRepository = WordRepository.get()
    //variable for the data we want to call

    var ManyWord = wordRepository.getItems()

    var selectedItemMutableLiveData = MutableLiveData<WordModel>()

    fun addWord(name:String){
        viewModelScope.launch {
            wordRepository.addWord(WordModel(name))

        }
    }
}