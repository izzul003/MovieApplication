package com.example.mymoviewdb.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities =
[
    Favorite::class,
    Popular::class
], version = 1,exportSchema=true)
abstract class MyMoviesRoomDatabase: RoomDatabase() {
    abstract fun favoriteDao() : FavoriteDao
    abstract fun popularDao() : PopularDao
    companion object {
        @Volatile
        private var INSTANCE: MyMoviesRoomDatabase? = null
        @JvmStatic
        fun getDatabase(context: Context): MyMoviesRoomDatabase {
            if (INSTANCE == null) {
                synchronized(MyMoviesRoomDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        MyMoviesRoomDatabase::class.java, "mymovies_database")
                        .build()
                }
            }
            return INSTANCE as MyMoviesRoomDatabase
        }
    }
}