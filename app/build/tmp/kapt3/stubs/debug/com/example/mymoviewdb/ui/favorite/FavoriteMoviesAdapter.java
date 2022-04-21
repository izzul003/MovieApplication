package com.example.mymoviewdb.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter$ViewHolder;", "data", "", "Lcom/example/mymoviewdb/room/Favorite;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "onItemClickCallback", "Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter$OnItemClickCallback;", "\u00e7ontextAdapter", "Landroid/content/Context;", "get\u00e7ontextAdapter", "()Landroid/content/Context;", "set\u00e7ontextAdapter", "(Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallback", "OnItemClickCallback", "ViewHolder", "app_debug"})
public final class FavoriteMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.ViewHolder> {
    private final java.util.List<com.example.mymoviewdb.room.Favorite> data = null;
    private final kotlin.jvm.functions.Function1<com.example.mymoviewdb.room.Favorite, kotlin.Unit> listener = null;
    public android.content.Context çontextAdapter;
    private com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.OnItemClickCallback onItemClickCallback;
    
    public FavoriteMoviesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.mymoviewdb.room.Favorite> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.mymoviewdb.room.Favorite, kotlin.Unit> listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getçontextAdapter() {
        return null;
    }
    
    public final void setçontextAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickCallback(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.OnItemClickCallback onItemClickCallback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "btnDeleteFavorite", "Landroid/widget/ImageView;", "imgPoster", "tvGenre", "Landroid/widget/TextView;", "tvTitle", "bindItem", "", "data", "Lcom/example/mymoviewdb/room/Favorite;", "listener", "Lkotlin/Function1;", "context", "Landroid/content/Context;", "onDeleteCallback", "Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter$OnItemClickCallback;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvTitle = null;
        private final android.widget.TextView tvGenre = null;
        private final android.widget.ImageView btnDeleteFavorite = null;
        private final android.widget.ImageView imgPoster = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.example.mymoviewdb.room.Favorite data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.mymoviewdb.room.Favorite, kotlin.Unit> listener, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.mymoviewdb.ui.favorite.FavoriteMoviesAdapter.OnItemClickCallback onDeleteCallback) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/mymoviewdb/ui/favorite/FavoriteMoviesAdapter$OnItemClickCallback;", "", "onItemClicked", "", "data", "Lcom/example/mymoviewdb/room/Favorite;", "app_debug"})
    public static abstract interface OnItemClickCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.example.mymoviewdb.room.Favorite data);
    }
}