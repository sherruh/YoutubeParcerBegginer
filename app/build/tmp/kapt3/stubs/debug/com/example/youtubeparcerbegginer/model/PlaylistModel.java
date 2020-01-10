package com.example.youtubeparcerbegginer.model;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.youtubeparcerbegginer.type_converters.PlaylistModelTypeConverter.class})
@androidx.room.Entity(tableName = "play_list")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/example/youtubeparcerbegginer/model/PlaylistModel;", "", "kind", "", "pageInfo", "Lcom/example/youtubeparcerbegginer/model/PageInfo;", "etag", "items", "", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "(Ljava/lang/String;Lcom/example/youtubeparcerbegginer/model/PageInfo;Ljava/lang/String;Ljava/util/List;)V", "getEtag", "()Ljava/lang/String;", "setEtag", "(Ljava/lang/String;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getKind", "setKind", "getPageInfo", "()Lcom/example/youtubeparcerbegginer/model/PageInfo;", "setPageInfo", "(Lcom/example/youtubeparcerbegginer/model/PageInfo;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class PlaylistModel {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "kind")
    private java.lang.String kind;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pageInfo")
    private com.example.youtubeparcerbegginer.model.PageInfo pageInfo;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "etag")
    private java.lang.String etag;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> items;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKind() {
        return null;
    }
    
    public final void setKind(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.model.PageInfo getPageInfo() {
        return null;
    }
    
    public final void setPageInfo(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PageInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEtag() {
        return null;
    }
    
    public final void setEtag(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> p0) {
    }
    
    public PlaylistModel(@org.jetbrains.annotations.NotNull()
    java.lang.String kind, @org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PageInfo pageInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String etag, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.model.PageInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.model.PlaylistModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String kind, @org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.model.PageInfo pageInfo, @org.jetbrains.annotations.NotNull()
    java.lang.String etag, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> items) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}