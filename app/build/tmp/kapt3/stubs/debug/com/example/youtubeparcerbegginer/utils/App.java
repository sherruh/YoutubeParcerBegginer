package com.example.youtubeparcerbegginer.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0000J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/youtubeparcerbegginer/utils/App;", "Landroid/app/Application;", "()V", "getDataBase", "Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "getInstance", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static com.example.youtubeparcerbegginer.db.AppDataBase database;
    @org.jetbrains.annotations.NotNull()
    public static com.example.youtubeparcerbegginer.utils.App instance;
    public static final com.example.youtubeparcerbegginer.utils.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.utils.App getInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.youtubeparcerbegginer.db.AppDataBase getDataBase() {
        return null;
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/youtubeparcerbegginer/utils/App$Companion;", "", "()V", "database", "Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "getDatabase", "()Lcom/example/youtubeparcerbegginer/db/AppDataBase;", "setDatabase", "(Lcom/example/youtubeparcerbegginer/db/AppDataBase;)V", "instance", "Lcom/example/youtubeparcerbegginer/utils/App;", "getInstance", "()Lcom/example/youtubeparcerbegginer/utils/App;", "setInstance", "(Lcom/example/youtubeparcerbegginer/utils/App;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.youtubeparcerbegginer.db.AppDataBase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.NotNull()
        com.example.youtubeparcerbegginer.db.AppDataBase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.youtubeparcerbegginer.utils.App getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.example.youtubeparcerbegginer.utils.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}