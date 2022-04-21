package com.example.mymoviewdb.ui.popular;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/mymoviewdb/ui/popular/PopularViewModel;", "Landroidx/lifecycle/ViewModel;", "mPopularRepository", "Lcom/example/mymoviewdb/repository/PopularRepository;", "(Lcom/example/mymoviewdb/repository/PopularRepository;)V", "getAllPopulars", "", "search", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mymoviewdb/room/Popular;", "title", "", "app_debug"})
public final class PopularViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mymoviewdb.repository.PopularRepository mPopularRepository = null;
    
    @javax.inject.Inject()
    public PopularViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mymoviewdb.repository.PopularRepository mPopularRepository) {
        super();
    }
    
    public final void getAllPopulars() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mymoviewdb.room.Popular>> search(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
}