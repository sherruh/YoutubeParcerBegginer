package com.example.youtubeparcerbegginer.utils;

import android.app.Application;
import androidx.room.Room
import com.example.youtubeparcerbegginer.db.AppDataBase

class App : Application() {
    companion object{
        lateinit var database: AppDataBase
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this,AppDataBase::class.java,"database")
            .build()
        instance = this
    }

    fun getInstance(): App{
        return instance
    }

    fun getDataBase(): AppDataBase{
        return database
    }
}
