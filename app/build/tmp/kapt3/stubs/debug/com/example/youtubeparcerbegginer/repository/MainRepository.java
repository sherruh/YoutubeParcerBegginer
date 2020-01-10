package com.example.youtubeparcerbegginer.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/youtubeparcerbegginer/repository/MainRepository;", "", "()V", "Companion", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String channel = "UC_IfiZu3VkesO3L58L9WPhA";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String apiKey = "AIzaSyCWK-EoCHecYMMFAvl-DI5iegR9s1WW20Y";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String part = "snippet,contentDetails";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String maxResult = "50";
    private static com.example.youtubeparcerbegginer.api.YoutubeApi apiService;
    public static final com.example.youtubeparcerbegginer.repository.MainRepository.Companion Companion = null;
    
    public MainRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0010R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/example/youtubeparcerbegginer/repository/MainRepository$Companion;", "", "()V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "apiService", "Lcom/example/youtubeparcerbegginer/api/YoutubeApi;", "channel", "getChannel", "maxResult", "getMaxResult", "part", "getPart", "fetchVideoData", "Landroidx/lifecycle/LiveData;", "Lcom/example/youtubeparcerbegginer/model/DetailVideoModel;", "videoId", "fetchYoutubeDetailPlaylistData", "Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;", "playlistId", "fetchYoutubePlaylistData", "Lcom/example/youtubeparcerbegginer/model/PlaylistModel;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getChannel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getApiKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPart() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMaxResult() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<com.example.youtubeparcerbegginer.model.PlaylistModel> fetchYoutubePlaylistData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.LiveData<com.example.youtubeparcerbegginer.model.DetailPlaylistModel> fetchYoutubeDetailPlaylistData(@org.jetbrains.annotations.NotNull()
        java.lang.String playlistId) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.lifecycle.LiveData<com.example.youtubeparcerbegginer.model.DetailVideoModel> fetchVideoData(@org.jetbrains.annotations.NotNull()
        java.lang.String videoId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}