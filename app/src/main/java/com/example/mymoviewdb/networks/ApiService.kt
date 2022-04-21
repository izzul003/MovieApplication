package com.example.mymoviewdb.networks

import com.example.mymoviewdb.networks.responses.DetailMovieResponse
import com.example.mymoviewdb.networks.responses.ListBannerResponse
import com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse
import retrofit2.Call
import retrofit2.http.*
import java.util.*

private var API_KEY = "bede790d3d767fd8607a6a330b5c877f"
private var THIS_YEAR = Calendar.getInstance().get(Calendar.YEAR)
private var NEXT_YEAR = Calendar.getInstance().get(Calendar.YEAR) + 1
interface ApiService {
    @GET("3/discover/movie?")
    fun getListBanner(
        @Query("api_key") api_key: String = API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String = "popularity.desc",
        @Query("include_adult") include_adult: Boolean = false,
        @Query("include_video") include_video: Boolean = false,
        @Query("page") page: Int = 1,
    ): Call<ListBannerResponse>

    @GET("3/discover/movie?")
    fun getListMoviewPopular(
        @Query("api_key") api_key: String = API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String = "popularity.desc",
        @Query("include_adult") include_adult: Boolean = false,
        @Query("include_video") include_video: Boolean = false,
        @Query("page") page: Int = 1,
    ): Call<ListBannerResponse>

    @GET("3/discover/movie?")
    fun getListComingSoonMovies(
        @Query("api_key") api_key: String = API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String = "popularity.desc",
        @Query("include_adult") include_adult: Boolean = false,
        @Query("include_video") include_video: Boolean = false,
        @Query("page") page: Int = 1,
        @Query("year") year: Int = NEXT_YEAR,
    ): Call<ListMovieCominSoonResponse>

    @GET("3/discover/movie?")
    fun getListPopularMovies(
        @Query("api_key") api_key: String = API_KEY,
        @Query("language") language: String = "en-US",
        @Query("sort_by") sort_by: String = "popularity.desc",
        @Query("include_adult") include_adult: Boolean = false,
        @Query("include_video") include_video: Boolean = false,
        @Query("page") page: Int = 1,
        @Query("year") year: Int = THIS_YEAR,
    ): Call<ListMovieCominSoonResponse>

    @GET("3/movie/{id}")
    fun getDetailMovie(
        @Path("id") id: Int,
        @Query("api_key") api_key: String = API_KEY,
        @Query("language") language: String = "en-US",
    ): Call<DetailMovieResponse>
}