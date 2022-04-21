package com.example.mymoviewdb.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.mymoviewdb.networks.ApiConfig
import com.example.mymoviewdb.networks.responses.ListBannerResponse
import com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse
import com.example.mymoviewdb.room.*
import com.example.mymoviewdb.ui.home.HomeViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.inject.Inject

class PopularRepository @Inject constructor(
    private val mPopularDao: PopularDao
){
    suspend fun seedDataPopulars() {
        val client = ApiConfig.getApiService().getListPopularMovies()
        client.enqueue(object : Callback<ListMovieCominSoonResponse> {
            override fun onResponse(
                call: Call<ListMovieCominSoonResponse>,
                response: Response<ListMovieCominSoonResponse>
            ) {
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        responseBody.results.toList().forEach { movie ->
                            mPopularDao.insert(
                                Popular(
                                    id = movie.id,
                                    title = movie.title,
                                    adult = movie.adult,
                                    backdrop_path = movie.backdrop_path,
                                    genre_ids = movie.genre_ids.toList().toString(),
                                    original_language = movie.original_language,
                                    original_title = movie.original_title,
                                    overview = movie.overview,
                                    popularity = movie.popularity,
                                    poster_path = movie.poster_path,
                                    release_date = movie.release_date,
                                    video = movie.video,
                                    vote_average = movie.vote_average,
                                    vote_count = movie.vote_count
                                )
                            )
                        }
                    }
                } else {
                    Log.e("REQUEST_POPULAR", "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ListMovieCominSoonResponse>, t: Throwable) {
                Log.e("REQUEST_POPULAR", "onFailure: ${t.message}")
            }
        })
    }
    fun getAllPopulars(): LiveData<List<Popular>> = mPopularDao.getAllPopulars()
    fun searchMovies(title: String?): LiveData<List<Popular>> = mPopularDao.searchPopulars(title)
    fun insert(popular: Popular) {
        mPopularDao.insert(popular)
    }

    fun delete(popular: Popular) {
        mPopularDao.delete(popular)
    }
    fun update(popular: Popular) {
        mPopularDao.update(popular)
    }
}