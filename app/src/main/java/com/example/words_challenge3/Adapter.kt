package com.example.words_challenge3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val letters: List<String>, private val onItemClick: (String) -> Unit) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.letter_fragment, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val letter = letters[position]
        holder.bind(letter)
        holder.itemView.setOnClickListener { onItemClick(letter) }
    }

    override fun getItemCount(): Int {
        return letters.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.textView_letter)

        fun bind(letter: String) {
            textView.text = letter
        }
    }
}

