package com.example.annmovies.domain.usecase.movie

import com.example.annmovies.domain.model.Movie
import com.example.annmovies.domain.repository.movie.MovieRepository
import com.example.annmovies.utils.Result

/**
 * Created by anahi.salgado on 15/03/2020
 */
class GetMovieImpl(private val movieRepository: MovieRepository): GetMovie {
    override fun getPopularMovies(): Result<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun getTopRatedMovies(): Result<List<Movie>> {
        TODO("Not yet implemented")
    }

    override fun getUpcomingMovies(): Result<List<Movie>> {
        TODO("Not yet implemented")
    }

}
