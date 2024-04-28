package com.example.words_challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.navigation.fragment.findNavController
import com.example.words_challenge3.databinding.LetterFragmentBinding

class LetterFragment : Fragment() {

    private var _binding: LetterFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: WordAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = LetterFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // List huruf abjad
        val letters = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")
        val bundle = Bundle()
//        bundle.putString(MESSAGE, data)

        findNavController().navigate(R.id.wordFragment)
        // Inisialisasi RecyclerView dengan adapter
//        val adapter = LetterAdapter(letters){ letter ->
//            // Navigasi ke WordFragment dan kirim data huruf yang dipilih
//            val action = Word
//            findNavController().navigate(action)
//        }

//        lateinit var recyclerView: RecyclerView
//        recyclerView.adapter = adapter
    }
    companion object{
        const val MESSAGE = "MESSAGE"
    }
}