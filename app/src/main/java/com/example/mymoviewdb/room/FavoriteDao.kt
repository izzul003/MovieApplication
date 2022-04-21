package com.example.mymoviewdb.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface FavoriteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(favorite: Favorite)

    @Update
    fun update(favorite: Favorite)

    @Delete
    fun delete(favorite: Favorite)

    @Query("SELECT * from favorite ORDER BY id ASC")
    fun getAllFavorites(): LiveData<List<Favorite>>

    @Query("SELECT * from favorite WHERE id=:id")
    fun getDetailFavorite(id: Int): LiveData<Favorite>

    @Query("SELECT * FROM favorite WHERE title LIKE '%' || :query || '%'")
    fun searchFavorites(query: String?): LiveData<List<Favorite>>
}