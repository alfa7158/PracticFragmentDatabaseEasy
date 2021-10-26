package com.example.practicfragmentdatabaseeasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.practicfragmentdatabaseeasy.R
import com.example.practicfragmentdatabaseeasy.viewModel.WordViewModel


class AddWordFragment : Fragment() {
    private val inventoryViewModel:WordViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_word, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val addButton:Button = view.findViewById(R.id.Add_button)
        val wordToEnter:EditText = view.findViewById(R.id.word_editText)

        addButton.setOnClickListener(){
            val word = wordToEnter.text.toString()
            if(word.isNotEmpty()){

                inventoryViewModel.addWord(word)
                ///popBackStack get to the fragment before it
                findNavController().popBackStack()

            }

        }

    }

}