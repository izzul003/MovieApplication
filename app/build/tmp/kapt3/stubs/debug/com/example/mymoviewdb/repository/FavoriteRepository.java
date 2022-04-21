package com.example.mymoviewdb.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/mymoviewdb/repository/FavoriteRepository;", "", "mFavoritesDao", "Lcom/example/mymoviewdb/room/FavoriteDao;", "(Lcom/example/mymoviewdb/room/FavoriteDao;)V", "delete", "", "favorite", "Lcom/example/mymoviewdb/room/Favorite;", "getAllFavorites", "Landroidx/lifecycle/LiveData;", "", "getDetailFavorites", "id", "", "insert", "searchMovies", "title", "", "update", "app_debug"})
public final class FavoriteRepository {
    private final com.example.mymoviewdb.room.FavoriteDao mFavoritesDao = null;
    
    @javax.inject.Inject()
    public FavoriteRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.FavoriteDao mFavoritesDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> getAllFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviewdb.room.Favorite> getDetailFavorites(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> searchMovies(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite) {
    }
}