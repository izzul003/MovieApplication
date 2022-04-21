package com.example.mymoviewdb.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mymoviewdb/di/AppModule;", "", "()V", "LOCAL_DATABASE_NAME", "", "database", "Lcom/example/mymoviewdb/room/MyMoviesRoomDatabase;", "app", "Landroid/content/Context;", "favoriteDao", "Lcom/example/mymoviewdb/room/FavoriteDao;", "db", "popularDao", "Lcom/example/mymoviewdb/room/PopularDao;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mymoviewdb.di.AppModule INSTANCE = null;
    private static java.lang.String LOCAL_DATABASE_NAME = "mymovies_database";
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.mymoviewdb.room.MyMoviesRoomDatabase database(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.mymoviewdb.room.FavoriteDao favoriteDao(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.MyMoviesRoomDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.mymoviewdb.room.PopularDao popularDao(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.MyMoviesRoomDatabase db) {
        return null;
    }
}