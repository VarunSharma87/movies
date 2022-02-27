package com.example.myapplication.movieapp.di

import com.example.myapplication.movieapp.data.network.MoviesAPI
import com.example.myapplication.movieapp.data.repository.IMovieRepository
import com.example.myapplication.movieapp.data.repository.MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module(includes = [ServiceModule::class])
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun provideMovieRepository(impl: MoviesRepository): IMovieRepository
}

@InstallIn(SingletonComponent::class)
@Module
internal object ServiceModule {
    @Provides
    @Singleton
    fun provideUserApi(): MoviesAPI {
        return Retrofit.Builder()
            .baseUrl(MoviesAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MoviesAPI::class.java)
    }
}