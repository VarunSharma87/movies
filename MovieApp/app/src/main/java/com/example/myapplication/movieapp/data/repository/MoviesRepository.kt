package com.example.myapplication.movieapp.data.repository

import com.example.myapplication.movieapp.data.db.dao.MovieDao
import com.example.myapplication.movieapp.data.network.MoviesAPI
import com.example.myapplication.movieapp.domain.model.Movie
import javax.inject.Inject


class MoviesRepository @Inject constructor(
    private val localSource: MovieDao,
    private val remoteSource: MoviesAPI,
    private val mapper: MovieMapper,
) : IMovieRepository {


    override suspend fun getMovies(offset: Int, maxCount: Int): List<Movie> {
        val movies = localSource.getMovies(offset, maxCount)
        if (movies.isNotEmpty()) {
            return mapper.toDomainModel(movies)
        }
        return emptyList()
    }

}