package com.example.youtubeparcerbegginer.type_converters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007J\u0016\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/example/youtubeparcerbegginer/type_converters/PlaylistModelTypeConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "fromItemsItem", "", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "data", "", "fromPageInfo", "Lcom/example/youtubeparcerbegginer/model/PageInfo;", "value", "toItemsItem", "objects", "toPageInfo", "app_debug"})
public final class PlaylistModelTypeConverter {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> fromItemsItem(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String toItemsItem(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> objects) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final com.example.youtubeparcerbegginer.model.PageInfo fromPageInfo(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String toPageInfo(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PageInfo objects) {
        return null;
    }
    
    public PlaylistModelTypeConverter() {
        super();
    }
}