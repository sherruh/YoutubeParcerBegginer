package com.example.youtubeparcerbegginer.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/youtubeparcerbegginer/db/YoutubeDao;", "", "fetchDetailPlaylist", "", "Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchDetailVideo", "Lcom/example/youtubeparcerbegginer/model/DetailVideoModel;", "getAllPlaylist", "Lcom/example/youtubeparcerbegginer/model/PlaylistModel;", "insertAllPlayList", "", "items", "(Lcom/example/youtubeparcerbegginer/model/PlaylistModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetailPlaylistData", "item", "(Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDetailVideo", "(Lcom/example/youtubeparcerbegginer/model/DetailVideoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface YoutubeDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertAllPlayList(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PlaylistModel items, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM play_list")
    public abstract java.lang.Object getAllPlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.youtubeparcerbegginer.model.PlaylistModel> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDetailPlaylistData(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.DetailPlaylistModel item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM detail_playlist")
    public abstract java.lang.Object fetchDetailPlaylist(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.youtubeparcerbegginer.model.DetailPlaylistModel>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertDetailVideo(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.DetailVideoModel item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM video_model")
    public abstract java.lang.Object fetchDetailVideo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.youtubeparcerbegginer.model.DetailVideoModel>> p0);
}