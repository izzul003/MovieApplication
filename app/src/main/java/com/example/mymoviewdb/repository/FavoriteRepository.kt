package com.example.mymoviewdb.repository

import androidx.lifecycle.LiveData
import com.example.mymoviewdb.room.Favorite
import com.example.mymoviewdb.room.FavoriteDao
import javax.inject.Inject

class FavoriteRepository @Inject constructor(
    private val mFavoritesDao: FavoriteDao
){
    fun getAllFavorites(): LiveData<List<Favorite>> = mFavoritesDao.getAllFavorites()
    fun getDetailFavorites(id: Int): LiveData<Favorite> = mFavoritesDao.getDetailFavorite(id)
    fun searchMovies(title: String?): LiveData<List<Favorite>> = mFavoritesDao.searchFavorites(title)
    fun insert(favorite: Favorite) {
        mFavoritesDao.insert(favorite)
    }
    fun delete(favorite: Favorite) {
        mFavoritesDao.delete(favorite)
    }
    fun update(favorite: Favorite) {
        mFavoritesDao.update(favorite)
    }
}