package com.example.words_challenge3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WordAdapter(private val words: List<String>, private val onItemClick: (String) -> Unit) :
    RecyclerView.Adapter<WordAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val word = words[position]
        holder.bind(word)
        holder.itemView.setOnClickListener { onItemClick(word) }
    }

    override fun getItemCount(): Int {
        return words.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(android.R.id.text1)

        fun bind(word: String) {
            textView.text = word
        }
    }
}
