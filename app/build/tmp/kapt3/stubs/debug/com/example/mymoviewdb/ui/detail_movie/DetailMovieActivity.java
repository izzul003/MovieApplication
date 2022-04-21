package com.example.mymoviewdb.ui.detail_movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/DetailMovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/example/mymoviewdb/databinding/ActivityDetailMovieBinding;", "binding", "getBinding", "()Lcom/example/mymoviewdb/databinding/ActivityDetailMovieBinding;", "dataDetail", "Lcom/example/mymoviewdb/networks/responses/DetailMovieResponse;", "isFavorite", "", "viewModel", "Lcom/example/mymoviewdb/ui/detail_movie/DetailMovieViewModel;", "displayContentMovie", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailMovieActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.example.mymoviewdb.databinding.ActivityDetailMovieBinding _binding;
    private com.example.mymoviewdb.networks.responses.DetailMovieResponse dataDetail;
    private com.example.mymoviewdb.ui.detail_movie.DetailMovieViewModel viewModel;
    private boolean isFavorite = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.mymoviewdb.ui.detail_movie.DetailMovieActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ID_MOVIE = "extra_id_movie";
    
    public DetailMovieActivity() {
        super();
    }
    
    private final com.example.mymoviewdb.databinding.ActivityDetailMovieBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void displayContentMovie() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/DetailMovieActivity$Companion;", "", "()V", "EXTRA_ID_MOVIE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}