package com.example.mymoviewdb.ui.favorite

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mymoviewdb.networks.responses.DetailMovieResponse
import com.example.mymoviewdb.repository.FavoriteRepository
import com.example.mymoviewdb.repository.PopularRepository
import com.example.mymoviewdb.room.Favorite
import com.example.mymoviewdb.room.Popular
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val mFavoriteRepository: FavoriteRepository
):ViewModel(){
    fun getAllFavorites(): LiveData<List<Favorite>> = mFavoriteRepository.getAllFavorites()

    fun search(title: String?) : LiveData<List<Favorite>> = mFavoriteRepository.searchMovies(title)

    fun deleteFavorite(favorite: Favorite) {
        mFavoriteRepository.delete(favorite)
    }

}