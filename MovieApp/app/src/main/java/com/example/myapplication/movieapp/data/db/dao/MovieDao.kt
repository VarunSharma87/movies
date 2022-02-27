package com.example.myapplication.movieapp.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.movieapp.data.db.entity.Movie

@Dao
interface MovieDao {
    @Insert
    suspend fun insertAll(movies: List<Movie>)

    @Query("Select * from movies LIMIT :limit OFFSET :offset")
    suspend fun getMovies(limit: Int, offset: Int): List<Movie>
}