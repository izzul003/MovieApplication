package com.example.mymoviewdb.ui.favorite;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mymoviewdb/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "mFavoriteRepository", "Lcom/example/mymoviewdb/repository/FavoriteRepository;", "(Lcom/example/mymoviewdb/repository/FavoriteRepository;)V", "deleteFavorite", "", "favorite", "Lcom/example/mymoviewdb/room/Favorite;", "getAllFavorites", "Landroidx/lifecycle/LiveData;", "", "search", "title", "", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mymoviewdb.repository.FavoriteRepository mFavoriteRepository = null;
    
    @javax.inject.Inject()
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.repository.FavoriteRepository mFavoriteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> getAllFavorites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Favorite>> search(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    public final void deleteFavorite(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.room.Favorite favorite) {
    }
}