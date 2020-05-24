package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.model.Movie
import com.example.annmovies.utils.Result
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 15/03/2020
 */
interface GetMovie {
    fun getPopularMovies(): Result<List<Movie>>
    fun getTopRatedMovies(): Result<List<Movie>>
    fun getUpcomingMovies(): Result<List<Movie>>
}