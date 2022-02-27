package com.example.myapplication.movieapp.domain.model

data class Movie(
    val id: Int,
    val name: String,
    val thumbnailUrl: String,
    val rating: Double?,
    val playListId: Int?,
)
