package com.example.mymoviewdb.ui.detail_movie;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/DetailMovieViewModel;", "Landroidx/lifecycle/ViewModel;", "mFavoriteRepository", "Lcom/example/mymoviewdb/repository/FavoriteRepository;", "(Lcom/example/mymoviewdb/repository/FavoriteRepository;)V", "_movie", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/mymoviewdb/networks/responses/DetailMovieResponse;", "movie", "Landroidx/lifecycle/LiveData;", "getMovie", "()Landroidx/lifecycle/LiveData;", "checkDataFavorite", "Lcom/example/mymoviewdb/room/Favorite;", "id", "", "deleteFavorite", "", "favorite", "getDetailMovie", "insertFavorite", "Companion", "app_debug"})
public final class DetailMovieViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mymoviewdb.repository.FavoriteRepository mFavoriteRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.mymoviewdb.networks.responses.DetailMovieResponse> _movie = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.mymoviewdb.networks.responses.DetailMovieResponse> movie = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mymoviewdb.ui.detail_movie.DetailMovieViewModel.Companion Companion = null;
    private static final java.lang.String TAG = "DetailMovieViewModel";
    
    @javax.inject.Inject()
    public DetailMovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.repository.FavoriteRepository mFavoriteRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviewdb.networks.responses.DetailMovieResponse> getMovie() {
        return null;
    }
    
    public final void getDetailMovie(int id) {
    }
    
    public final void insertFavorite(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.networks.responses.DetailMovieResponse favorite) {
    }
    
    public final void deleteFavorite(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.networks.responses.DetailMovieResponse favorite) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.mymoviewdb.room.Favorite> checkDataFavorite(int id) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/DetailMovieViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}