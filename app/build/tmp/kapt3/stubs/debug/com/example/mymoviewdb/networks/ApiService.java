package com.example.mymoviewdb.networks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'JJ\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u0006H\'JT\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010\u0013\u001a\u00020\u0006H\'JJ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u0006H\'JT\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\f\u001a\u00020\b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010\u0013\u001a\u00020\u0006H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/example/mymoviewdb/networks/ApiService;", "", "getDetailMovie", "Lretrofit2/Call;", "Lcom/example/mymoviewdb/networks/responses/DetailMovieResponse;", "id", "", "api_key", "", "language", "getListBanner", "Lcom/example/mymoviewdb/networks/responses/ListBannerResponse;", "sort_by", "include_adult", "", "include_video", "page", "getListComingSoonMovies", "Lcom/example/mymoviewdb/networks/responses/ListMovieCominSoonResponse;", "year", "getListMoviewPopular", "getListPopularMovies", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "3/discover/movie?")
    public abstract retrofit2.Call<com.example.mymoviewdb.networks.responses.ListBannerResponse> getListBanner(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort_by")
    java.lang.String sort_by, @retrofit2.http.Query(value = "include_adult")
    boolean include_adult, @retrofit2.http.Query(value = "include_video")
    boolean include_video, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "3/discover/movie?")
    public abstract retrofit2.Call<com.example.mymoviewdb.networks.responses.ListBannerResponse> getListMoviewPopular(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort_by")
    java.lang.String sort_by, @retrofit2.http.Query(value = "include_adult")
    boolean include_adult, @retrofit2.http.Query(value = "include_video")
    boolean include_video, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "3/discover/movie?")
    public abstract retrofit2.Call<com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse> getListComingSoonMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort_by")
    java.lang.String sort_by, @retrofit2.http.Query(value = "include_adult")
    boolean include_adult, @retrofit2.http.Query(value = "include_video")
    boolean include_video, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "year")
    int year);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "3/discover/movie?")
    public abstract retrofit2.Call<com.example.mymoviewdb.networks.responses.ListMovieCominSoonResponse> getListPopularMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sort_by")
    java.lang.String sort_by, @retrofit2.http.Query(value = "include_adult")
    boolean include_adult, @retrofit2.http.Query(value = "include_video")
    boolean include_video, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "year")
    int year);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "3/movie/{id}")
    public abstract retrofit2.Call<com.example.mymoviewdb.networks.responses.DetailMovieResponse> getDetailMovie(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String language);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}