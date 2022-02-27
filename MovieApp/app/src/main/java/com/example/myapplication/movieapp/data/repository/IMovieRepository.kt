package com.example.myapplication.movieapp.data.repository

import com.example.myapplication.movieapp.domain.model.Movie

interface IMovieRepository {
    suspend fun getMovies(offset: Int, maxCount: Int): List<Movie>
}