package com.example.movie.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\t\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/movie/domain/MovieRepositoryImpl;", "Lcom/example/movie/domain/MovieRepository;", "dataSource", "Lcom/example/movie/data/remote/MovieDataSource;", "(Lcom/example/movie/data/remote/MovieDataSource;)V", "getPopularMovies", "Lcom/example/movie/data/model/MovieList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRatedMovies", "getUpcomingMovies", "app_debug"})
public final class MovieRepositoryImpl implements com.example.movie.domain.MovieRepository {
    private final com.example.movie.data.remote.MovieDataSource dataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUpcomingMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.movie.data.model.MovieList> p0) {
        return null;
    }
    
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.movie.data.remote.MovieDataSource dataSource) {
        super();
    }
}