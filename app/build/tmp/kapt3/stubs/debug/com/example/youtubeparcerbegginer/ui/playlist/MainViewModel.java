package com.example.youtubeparcerbegginer.ui.playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/youtubeparcerbegginer/ui/playlist/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "db", "Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "getDb", "()Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "getDataFromDB", "Lcom/example/youtubeparcerbegginer/model/PlaylistModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlaylistData", "Landroidx/lifecycle/LiveData;", "insertPlaylistData", "", "model", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.youtubeparcerbegginer.db.AppDataBase db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.db.AppDataBase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.youtubeparcerbegginer.model.PlaylistModel> getPlaylistData() {
        return null;
    }
    
    public final void insertPlaylistData(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PlaylistModel model) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDataFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.youtubeparcerbegginer.model.PlaylistModel> p0) {
        return null;
    }
    
    public MainViewModel() {
        super();
    }
}