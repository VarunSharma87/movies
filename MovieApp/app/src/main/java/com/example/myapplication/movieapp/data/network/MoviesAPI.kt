package com.example.myapplication.movieapp.data.network

import com.example.myapplication.movieapp.data.db.entity.Movie
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

interface MoviesAPI {
    @GET(nowPlaying)
    suspend fun getMovies(@Query("page") page: Int): Movie

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/movie"
        private const val key = "api_key=38a73d59546aa378980a88b645f487fc"
        private const val language = "en-US"
        private const val nowPlaying = "now_playing?$key"
    }
}