package com.example.mymoviewdb.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mymoviewdb/repository/PopularRepository;", "", "mPopularDao", "Lcom/example/mymoviewdb/room/PopularDao;", "(Lcom/example/mymoviewdb/room/PopularDao;)V", "delete", "", "popular", "Lcom/example/mymoviewdb/room/Popular;", "getAllPopulars", "Landroidx/lifecycle/LiveData;", "", "insert", "searchMovies", "title", "", "seedDataPopulars", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class PopularRepository {
    private final com.example.mymoviewdb.room.PopularDao mPopularDao = null;
    
    @javax.inject.Inject()
    public PopularRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.PopularDao mPopularDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object seedDataPopulars(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Popular>> getAllPopulars() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Popular>> searchMovies(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Popular popular) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Popular popular) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Popular popular) {
    }
}