package com.example.practicfragmentdatabaseeasy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.practicfragmentdatabaseeasy.Model.WordModel
import com.example.practicfragmentdatabaseeasy.R
import com.example.practicfragmentdatabaseeasy.viewModel.WordViewModel

class WordAdapter
    (val items: List<WordModel>,val viewModel: WordViewModel):
    RecyclerView.Adapter<WordAdapter.InventoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InventoryViewHolder {

        return InventoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.word_layout,
                parent,
                false
            )
        )
    }

    class InventoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.wordTextView)

    }

    override fun onBindViewHolder(holder: InventoryViewHolder, position: Int) {

        val word = items[position]

        holder.nameTextView.text = word.word


        /// itemView is the items in the recyclerView


    }

    override fun getItemCount(): Int {
        return items.size
    }
}