package com.example.myapplication.movieapp.data.repository

import javax.inject.Inject
import com.example.myapplication.movieapp.data.db.entity.Movie as RemoteModel
import com.example.myapplication.movieapp.domain.model.Movie as DomainModel

class MovieMapper @Inject constructor() {

    fun toDomainModel(remoteModel: List<RemoteModel>): List<DomainModel> {
        val movies = mutableListOf<DomainModel>()
        remoteModel.forEach { movie ->
            movies.add(DomainModel(
                movie.id,
                movie.title,
                movie.backdrop_path,
                movie.vote_average,
                movie.playListId
            ))
        }
        return movies
    }

    fun toRemoteModel(domainModel: List<DomainModel>): List<RemoteModel> {
        // TODO
        val movies = mutableListOf<RemoteModel>()
        return movies
    }

}