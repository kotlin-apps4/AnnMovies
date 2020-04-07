package com.example.annmovies.data.repository.movie

import com.example.annmovies.domain.model.Movie
import com.example.annmovies.domain.repository.movie.MovieRepository
import io.reactivex.rxjava3.core.Single

/**
 * Created by anahi.salgado on 23/03/2020
 */
class MovieRepositoryImpl: MovieRepository {
    override fun getPopularMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTopRatedMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getUpcomingMovies(): Single<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}