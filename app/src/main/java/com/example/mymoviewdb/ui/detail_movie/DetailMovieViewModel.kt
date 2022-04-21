package com.example.mymoviewdb.ui.detail_movie

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviewdb.networks.ApiConfig
import com.example.mymoviewdb.networks.responses.DetailMovieResponse
import com.example.mymoviewdb.networks.responses.ListBannerResponse
import com.example.mymoviewdb.networks.responses.ResultBanner
import com.example.mymoviewdb.repository.FavoriteRepository
import com.example.mymoviewdb.room.Favorite
import com.example.mymoviewdb.ui.home.HomeViewModel
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class DetailMovieViewModel @Inject constructor(
    private val mFavoriteRepository: FavoriteRepository
): ViewModel(){
    private val _movie = MutableLiveData<DetailMovieResponse>()
    val movie: LiveData<DetailMovieResponse> = _movie

    companion object{
        private const val TAG = "DetailMovieViewModel"
    }

    fun getDetailMovie(id: Int) {
        Log.d("CEK_DETAIL_FUNCTION", "MASUK FUNCTION")

        val client = ApiConfig.getApiService().getDetailMovie(id)
        client.enqueue(object : Callback<DetailMovieResponse> {
            override fun onResponse(
                call: Call<DetailMovieResponse>,
                response: Response<DetailMovieResponse>
            ) {
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        Log.d("CEK_RESPONSE_DETAIL", responseBody.toString())
                        _movie.postValue(responseBody!!)
                    }
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                    Log.e(TAG, "onFailure: ${response}")
                }
            }
            override fun onFailure(call: Call<DetailMovieResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
                Log.e(TAG, "onFailure: ${t}")

            }
        })
    }

    fun insertFavorite(favorite: DetailMovieResponse) {
        mFavoriteRepository.insert(
            Favorite(
                id = favorite.id,
                title = favorite.title,
                adult = favorite.adult,
                backdrop_path = favorite.backdrop_path,
                genre_ids = Gson().toJson(favorite.genres),
                original_language = favorite.original_language,
                original_title = favorite.original_title,
                overview = favorite.overview,
                popularity = favorite.popularity,
                poster_path = favorite.poster_path,
                release_date = favorite.release_date,
                video = favorite.video,
                vote_average = favorite.vote_average,
                vote_count = favorite.vote_count
            )
        )
    }

    fun deleteFavorite(favorite: DetailMovieResponse) {
        mFavoriteRepository.delete(
            Favorite(
                id = favorite.id,
                title = favorite.title,
                adult = favorite.adult,
                backdrop_path = favorite.backdrop_path,
                genre_ids = Gson().toJson(favorite.genres),
                original_language = favorite.original_language,
                original_title = favorite.original_title,
                overview = favorite.overview,
                popularity = favorite.popularity,
                poster_path = favorite.poster_path,
                release_date = favorite.release_date,
                video = favorite.video,
                vote_average = favorite.vote_average,
                vote_count = favorite.vote_count
            )
        )
    }

    fun checkDataFavorite(id: Int): LiveData<Favorite> = mFavoriteRepository.getDetailFavorites(id)

}