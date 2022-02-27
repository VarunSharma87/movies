package com.example.myapplication.movieapp.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Playlist(
    @PrimaryKey val id: String,
    val name: String
)