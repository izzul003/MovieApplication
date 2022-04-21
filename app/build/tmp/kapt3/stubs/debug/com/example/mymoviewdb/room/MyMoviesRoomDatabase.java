package com.example.mymoviewdb.room;

import java.lang.System;

@androidx.room.Database(entities = {com.example.mymoviewdb.room.Favorite.class, com.example.mymoviewdb.room.Popular.class}, version = 1, exportSchema = true)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/mymoviewdb/room/MyMoviesRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "favoriteDao", "Lcom/example/mymoviewdb/room/FavoriteDao;", "popularDao", "Lcom/example/mymoviewdb/room/PopularDao;", "Companion", "app_debug"})
public abstract class MyMoviesRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mymoviewdb.room.MyMoviesRoomDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.example.mymoviewdb.room.MyMoviesRoomDatabase INSTANCE;
    
    public MyMoviesRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.mymoviewdb.room.FavoriteDao favoriteDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.mymoviewdb.room.PopularDao popularDao();
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.example.mymoviewdb.room.MyMoviesRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/mymoviewdb/room/MyMoviesRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/mymoviewdb/room/MyMoviesRoomDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.example.mymoviewdb.room.MyMoviesRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}