package com.example.lab_05

import android.app.Application
import com.example.lab_05.data.movies
import com.example.lab_05.repository.MovieRepository

class MovieReviewerApplication : Application() {
    val movieRepository : MovieRepository by lazy {
        MovieRepository(movies)
    }
}