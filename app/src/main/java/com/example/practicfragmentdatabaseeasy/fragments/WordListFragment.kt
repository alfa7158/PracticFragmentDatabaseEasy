package com.example.practicfragmentdatabaseeasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.practicfragmentdatabaseeasy.Model.WordModel
import com.example.practicfragmentdatabaseeasy.R
import com.example.practicfragmentdatabaseeasy.adapter.WordAdapter
import com.example.practicfragmentdatabaseeasy.viewModel.WordViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class WordListFragment : Fragment() {
    private val theWords = mutableListOf<WordModel>()
    private val WordsModel : WordViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val wordsRcyclerView:RecyclerView = view.findViewById(R.id.wordListView)
        val addFloatingActionButton:FloatingActionButton = view.findViewById(R.id.floatingButton)
        val wordsAdapter = WordAdapter(theWords,WordsModel)
        wordsRcyclerView.adapter = wordsAdapter
        WordsModel.ManyWord.observe(viewLifecycleOwner, Observer { it?.let {
                items ->
            theWords.clear()
            theWords.addAll(items)
            wordsAdapter.notifyDataSetChanged() } })



        addFloatingActionButton.setOnClickListener(){
            findNavController().navigate(R.id.action_wordListFragment_to_addWordFragment)


        }

    }
    }


