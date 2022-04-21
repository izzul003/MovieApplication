package com.example.mymoviewdb.ui.detail_movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/GenreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mymoviewdb/ui/detail_movie/GenreAdapter$ViewHolder;", "data", "", "Lcom/example/mymoviewdb/networks/responses/Genres;", "listener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "\u00e7ontextAdapter", "Landroid/content/Context;", "get\u00e7ontextAdapter", "()Landroid/content/Context;", "set\u00e7ontextAdapter", "(Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class GenreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mymoviewdb.ui.detail_movie.GenreAdapter.ViewHolder> {
    private final java.util.List<com.example.mymoviewdb.networks.responses.Genres> data = null;
    private final kotlin.jvm.functions.Function1<com.example.mymoviewdb.networks.responses.Genres, kotlin.Unit> listener = null;
    public android.content.Context çontextAdapter;
    
    public GenreAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.mymoviewdb.networks.responses.Genres> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.mymoviewdb.networks.responses.Genres, kotlin.Unit> listener) {
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
    public com.example.mymoviewdb.ui.detail_movie.GenreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.ui.detail_movie.GenreAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mymoviewdb/ui/detail_movie/GenreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "ivPoint", "Landroid/widget/ImageView;", "tvTitle", "Landroid/widget/TextView;", "bindItem", "", "data", "Lcom/example/mymoviewdb/networks/responses/Genres;", "listener", "Lkotlin/Function1;", "context", "Landroid/content/Context;", "position", "", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvTitle = null;
        private final android.widget.ImageView ivPoint = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        com.example.mymoviewdb.networks.responses.Genres data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.mymoviewdb.networks.responses.Genres, kotlin.Unit> listener, @org.jetbrains.annotations.NotNull()
        android.content.Context context, int position) {
        }
    }
}