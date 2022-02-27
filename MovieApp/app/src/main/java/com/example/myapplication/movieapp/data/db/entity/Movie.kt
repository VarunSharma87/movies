package com.example.myapplication.movieapp.data.db.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(tableName = "movies", foreignKeys = [ForeignKey(entity = Playlist::class,
    parentColumns = arrayOf("id"),
    childColumns = arrayOf("playListId"),
    onDelete = CASCADE)])
data class Movie(
    @PrimaryKey val id: Int,
    val playListId: Int = 0,
    val adult: Boolean,
    val backdrop_path: String,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val video: Boolean,
    val vote_average: Double?,
    val vote_count: Int,
)