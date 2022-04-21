package com.example.mymoviewdb.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PopularDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(popular: Popular)

    @Update
    fun update(popular: Popular)

    @Delete
    fun delete(popular: Popular)

    @Query("SELECT * from popular ORDER BY id ASC")
    fun getAllPopulars(): LiveData<List<Popular>>

    @Query("SELECT * FROM popular WHERE title LIKE '%' || :query || '%'")
    fun searchPopulars(query: String?): LiveData<List<Popular>>
}