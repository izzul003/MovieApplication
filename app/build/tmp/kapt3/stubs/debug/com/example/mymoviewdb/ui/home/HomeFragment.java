package com.example.mymoviewdb.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0002J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/mymoviewdb/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/mymoviewdb/databinding/HomeFragmentBinding;", "binding", "getBinding", "()Lcom/example/mymoviewdb/databinding/HomeFragmentBinding;", "dataList", "Ljava/util/ArrayList;", "Lcom/example/mymoviewdb/models/Film;", "viewModel", "Lcom/example/mymoviewdb/ui/home/HomeViewModel;", "generateBanners", "", "list", "", "Lcom/example/mymoviewdb/networks/responses/ResultBanner;", "generatePopularMovie", "generateSoonMovies", "Lcom/example/mymoviewdb/networks/responses/ResultCominSoon;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.example.mymoviewdb.databinding.HomeFragmentBinding _binding;
    private java.util.ArrayList<com.example.mymoviewdb.models.Film> dataList;
    private com.example.mymoviewdb.ui.home.HomeViewModel viewModel;
    
    public HomeFragment() {
        super();
    }
    
    private final com.example.mymoviewdb.databinding.HomeFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void generateSoonMovies(java.util.List<com.example.mymoviewdb.networks.responses.ResultCominSoon> list) {
    }
    
    private final void generateBanners(java.util.List<com.example.mymoviewdb.networks.responses.ResultBanner> list) {
    }
    
    private final void generatePopularMovie(java.util.List<com.example.mymoviewdb.networks.responses.ResultBanner> list) {
    }
}