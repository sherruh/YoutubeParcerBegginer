package com.example.youtubeparcerbegginer.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/youtubeparcerbegginer/adapter/PlaylistAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/youtubeparcerbegginer/adapter/PlaylistAdapter$YouTubeViewHolder;", "function", "Lkotlin/Function1;", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "", "(Lkotlin/jvm/functions/Function1;)V", "getFunction", "()Lkotlin/jvm/functions/Function1;", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "newList", "", "YouTubeViewHolder", "app_debug"})
public final class PlaylistAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.youtubeparcerbegginer.adapter.PlaylistAdapter.YouTubeViewHolder> {
    private java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> list;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> function = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.youtubeparcerbegginer.adapter.PlaylistAdapter.YouTubeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.youtubeparcerbegginer.adapter.PlaylistAdapter.YouTubeViewHolder holder, int position) {
    }
    
    public final void updateData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.youtubeparcerbegginer.model.ItemsItem> newList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> getFunction() {
        return null;
    }
    
    public PlaylistAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> function) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/youtubeparcerbegginer/adapter/PlaylistAdapter$YouTubeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "function", "Lkotlin/Function1;", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "description", "Landroid/widget/TextView;", "getFunction", "()Lkotlin/jvm/functions/Function1;", "image", "Landroid/widget/ImageView;", "title", "bind", "item", "app_debug"})
    public static final class YouTubeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.ImageView image;
        private android.widget.TextView title;
        private android.widget.TextView description;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> function = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.youtubeparcerbegginer.model.ItemsItem item) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> getFunction() {
            return null;
        }
        
        public YouTubeViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.youtubeparcerbegginer.model.ItemsItem, kotlin.Unit> function) {
            super(null);
        }
    }
}