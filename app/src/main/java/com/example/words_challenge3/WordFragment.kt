package com.example.words_challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.words_challenge3.databinding.WordFragmentBinding

class WordFragment : Fragment() {

    private var _binding: WordFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = WordFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun getWordsByLetter(selectedLetter: Any): List<String> {
        val letter = selectedLetter.toString()
        return when (letter) {
            "A" -> listOf("Apple", "Ant", "Air", "Army", "Aqua")
            "B" -> listOf("Banana", "Ball", "Butterfly", "Book", "Box")
            "C" -> listOf("Cat", "Car", "Cake", "Cup", "Cloud")
            "D" -> listOf("Dog", "Dolphin", "Diamond", "Door", "Drum")
            "E" -> listOf("Elephant", "Eagle", "Egg", "Earth", "Envelope")
            "F" -> listOf("Fox", "Fish", "Flower", "Feather", "Flag")
            "G" -> listOf("Goat", "Giraffe", "Globe", "Guitar", "Glass")
            "H" -> listOf("Horse", "House", "Hat", "Heart", "Hammer")
            "I" -> listOf("Ice cream", "Island", "Igloo", "Ink", "Iron")
            "J" -> listOf("Jellyfish", "Jacket", "Jigsaw", "Jar", "Juice")
            else -> listOf()
        }
    }
}


