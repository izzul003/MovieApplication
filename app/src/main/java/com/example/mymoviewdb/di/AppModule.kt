package com.example.mymoviewdb.di

import android.content.Context
import android.os.Build
import android.os.UserManager
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.room.Room
import com.example.mymoviewdb.App
import com.example.mymoviewdb.room.MyMoviesRoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlin.properties.Delegates

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    private var LOCAL_DATABASE_NAME = "mymovies_database"

    @Singleton
    @Provides
    fun database(@ApplicationContext app: Context) = Room.databaseBuilder(
        app, MyMoviesRoomDatabase::class.java, LOCAL_DATABASE_NAME)
        .allowMainThreadQueries()
        .build()

    @Singleton
    @Provides
    fun favoriteDao(db:MyMoviesRoomDatabase) = db.favoriteDao()

    @Singleton
    @Provides
    fun popularDao(db: MyMoviesRoomDatabase) = db.popularDao()
}