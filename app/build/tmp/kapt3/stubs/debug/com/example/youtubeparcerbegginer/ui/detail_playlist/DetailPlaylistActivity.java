package com.example.youtubeparcerbegginer.ui.detail_playlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0012\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0015H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/youtubeparcerbegginer/ui/detail_playlist/DetailPlaylistActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/youtubeparcerbegginer/adapter/DetailPlaylistAdapter;", "description", "", "id", "title", "toolBar", "Landroidx/appcompat/widget/Toolbar;", "viewModel", "Lcom/example/youtubeparcerbegginer/ui/detail_playlist/DetailPlaylistViewModel;", "click", "", "item", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "getDetailPlaylistData", "getExtraDetailPlaylistModel", "model", "", "Lcom/example/youtubeparcerbegginer/model/DetailPlaylistModel;", "getIntentData", "initAdapter", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "Landroid/view/MenuItem;", "subscribeToViewModel", "updateDatabasePlaylistData", "value", "updateViews", "it", "Companion", "app_debug"})
public final class DetailPlaylistActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.appcompat.widget.Toolbar toolBar;
    private com.example.youtubeparcerbegginer.ui.detail_playlist.DetailPlaylistViewModel viewModel;
    private com.example.youtubeparcerbegginer.adapter.DetailPlaylistAdapter adapter;
    private java.lang.String id;
    private java.lang.String title;
    private java.lang.String description;
    public static final com.example.youtubeparcerbegginer.ui.detail_playlist.DetailPlaylistActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getDetailPlaylistData() {
    }
    
    private final void getExtraDetailPlaylistModel(java.util.List<com.example.youtubeparcerbegginer.model.DetailPlaylistModel> model) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void getIntentData() {
    }
    
    private final void initAdapter() {
    }
    
    private final void click(com.example.youtubeparcerbegginer.model.ItemsItem item) {
    }
    
    private final void subscribeToViewModel() {
    }
    
    private final void updateDatabasePlaylistData(com.example.youtubeparcerbegginer.model.DetailPlaylistModel value) {
    }
    
    private final void updateViews(com.example.youtubeparcerbegginer.model.DetailPlaylistModel it) {
    }
    
    public DetailPlaylistActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/youtubeparcerbegginer/ui/detail_playlist/DetailPlaylistActivity$Companion;", "", "()V", "startActivity", "", "item", "Lcom/example/youtubeparcerbegginer/model/ItemsItem;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        com.example.youtubeparcerbegginer.model.ItemsItem item, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}