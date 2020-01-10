package com.example.youtubeparcerbegginer.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006H\'J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/youtubeparcerbegginer/api/YoutubeApi;", "", "getDetailPlaylist", "Lretrofit2/Call;", "Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;", "part", "", "apiKey", "playlistId", "maxResults", "getDetailVideo", "Lcom/example/youtubeparcerbegginer/model/DetailVideoModel;", "id", "getPlaylists", "Lcom/example/youtubeparcerbegginer/model/PlaylistModel;", "channelId", "app_debug"})
public abstract interface YoutubeApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "youtube/v3/playlists")
    public abstract retrofit2.Call<com.example.youtubeparcerbegginer.model.PlaylistModel> getPlaylists(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "part")
    java.lang.String part, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "channelId")
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "maxResults")
    java.lang.String maxResults);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "youtube/v3/playlistItems")
    public abstract retrofit2.Call<com.example.youtubeparcerbegginer.model.DetailPlaylistModel> getDetailPlaylist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "part")
    java.lang.String part, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "playlistId")
    java.lang.String playlistId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "maxResults")
    java.lang.String maxResults);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "youtube/v3/videos")
    public abstract retrofit2.Call<com.example.youtubeparcerbegginer.model.DetailVideoModel> getDetailVideo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "part")
    java.lang.String part, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "id")
    java.lang.String id);
}