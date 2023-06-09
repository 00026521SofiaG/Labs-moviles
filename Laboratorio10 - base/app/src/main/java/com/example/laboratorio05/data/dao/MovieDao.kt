package com.example.laboratorio05.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.data.model.MovieWithActor

@Dao
interface MovieDao {

    @Query("SELECT * FROM movie_table")
    suspend fun getAllMovies(): List<MovieModel>


    @Transaction
    @Insert
    suspend fun insertMovie(movieModel: MovieModel)


    @Query("SELECT * FROM movie_table WHERE movieId = :movieId")
    suspend fun getMoviesWithActorsById(movieId : Int): MovieWithActor?
}