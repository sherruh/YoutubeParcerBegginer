package com.example.youtubeparcerbegginer.ui.detail_playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/youtubeparcerbegginer/ui/detail_playlist/DetailPlaylistViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "db", "Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "getDb", "()Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "fetchDetailPlaylistData", "Landroidx/lifecycle/LiveData;", "Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;", "id", "", "getDetailPlaylistModel", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetailPlaylistData", "", "value", "app_debug"})
public final class DetailPlaylistViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.youtubeparcerbegginer.db.AppDataBase db = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.db.AppDataBase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.example.youtubeparcerbegginer.model.DetailPlaylistModel> fetchDetailPlaylistData(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetailPlaylistModel(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.youtubeparcerbegginer.model.DetailPlaylistModel>> p0) {
        return null;
    }
    
    public final void insertDetailPlaylistData(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.DetailPlaylistModel value) {
    }
    
    public DetailPlaylistViewModel() {
        super();
    }
}