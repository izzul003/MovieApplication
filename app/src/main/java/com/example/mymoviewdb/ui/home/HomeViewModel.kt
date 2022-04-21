package com.example.mymoviewdb.ui.home

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviewdb.networks.ApiConfig
import com.example.mymoviewdb.networks.responses.ListBannerResponse
import com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse
import com.example.mymoviewdb.networks.responses.ResultBanner
import com.example.mymoviewdb.networks.responses.ResultCominSoon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel (application: Application) : AndroidViewModel(application){
    private val _banners = MutableLiveData<List<ResultBanner>>()
    val banners: LiveData<List<ResultBanner>> = _banners
    private val _populars = MutableLiveData<List<ResultBanner>>()
    val populars: LiveData<List<ResultBanner>> = _populars
    private val _soons = MutableLiveData<List<ResultCominSoon>>()
    val soons: LiveData<List<ResultCominSoon>> = _soons

    companion object{
        private const val TAG = "HomeViewModel"
    }

    fun getListBanners() {
        val client = ApiConfig.getApiService().getListBanner()
        client.enqueue(object : Callback<ListBannerResponse>{
            override fun onResponse(
                call: Call<ListBannerResponse>,
                response: Response<ListBannerResponse>
            ) {
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        _banners.postValue(responseBody.results.toList())
                    }
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ListBannerResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }

    fun getListPopulars() {
        val client = ApiConfig.getApiService().getListMoviewPopular()
        client.enqueue(object : Callback<ListBannerResponse>{
            override fun onResponse(
                call: Call<ListBannerResponse>,
                response: Response<ListBannerResponse>
            ) {
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        _populars.postValue(responseBody.results.toList())
                    }
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ListBannerResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }

    fun getListComingSoons() {
        val client = ApiConfig.getApiService().getListComingSoonMovies()
        client.enqueue(object : Callback<ListMovieCominSoonResponse>{
            override fun onResponse(
                call: Call<ListMovieCominSoonResponse>,
                response: Response<ListMovieCominSoonResponse>
            ) {
                if (response.isSuccessful) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        _soons.postValue(responseBody.results.toList())
                    }
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ListMovieCominSoonResponse>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message}")
            }
        })
    }
}