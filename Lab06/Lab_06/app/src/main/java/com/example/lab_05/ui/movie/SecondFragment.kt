package com.example.lab_05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lab_05.R
import com.example.lab_05.data.model.MovieModel

class SecondFragment : Fragment() {

    private val movieViewModel : MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private lateinit var btnSubmit: Button
    private lateinit var nameEditText: EditText
    private lateinit var categoryEditText: EditText
    private lateinit var qualificationEditText: EditText
    private lateinit var descripcionEditText: EditText


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()
        btnSubmit.setOnClickListener {
            addMovie()
        }


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    private fun bind() {
        nameEditText = view?.findViewById(R.id.name)!!
        categoryEditText = view?.findViewById(R.id.CATEGORY)!!
        descripcionEditText = view?.findViewById(R.id.description)!!
        qualificationEditText = view?.findViewById(R.id.Calification)!!
        btnSubmit =view?.findViewById(R.id.submit)!!

    }

    private fun addMovie() {
        val name = nameEditText.text.toString()
        val category = categoryEditText.text.toString()
        val description= descripcionEditText.text.toString()
        val qualification = qualificationEditText.text.toString()

        val movie = MovieModel(name, category,description,qualification)

        movieViewModel.addMovies(movie)

        Log.d("SeconFragment", movieViewModel.getMovies().toString())

        findNavController().popBackStack()
    }

}