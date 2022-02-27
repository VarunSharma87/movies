package com.example.myapplication.movieapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.movieapp.data.db.entity.Movie
import com.example.myapplication.movieapp.data.db.entity.Playlist

@Database(entities = [Movie::class, Playlist::class], version = 1)
abstract class MoviesDB : RoomDatabase() {
    abstract fun moviesDB(): MoviesDB
}