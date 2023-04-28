package com.example.lab_05.repository

import com.example.lab_05.data.model.MovieModel

class MovieRepository(private val movies: MutableList<MovieModel>) {

    fun getMovies()= movies

    fun addMovies(movie: MovieModel) =movies.add(movie)
}