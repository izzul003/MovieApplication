package com.example.mymoviewdb.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/mymoviewdb/room/FavoriteDao;", "", "delete", "", "favorite", "Lcom/example/mymoviewdb/room/Favorite;", "getAllFavorites", "Landroidx/lifecycle/LiveData;", "", "getDetailFavorite", "id", "", "insert", "searchFavorites", "query", "", "update", "app_debug"})
public abstract interface FavoriteDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from favorite ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> getAllFavorites();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from favorite WHERE id=:id")
    public abstract androidx.lifecycle.LiveData<com.example.mymoviewdb.room.Favorite> getDetailFavorite(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorite WHERE title LIKE \'%\' || :query || \'%\'")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> searchFavorites(@org.jetbrains.annotations.Nullable()
    java.lang.String query);
}