package com.example.youtubeparcerbegginer.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.youtubeparcerbegginer.model.PlaylistModel
import com.example.youtubeparcerbegginer.model.YtVideo

@Database(entities = [
PlaylistModel::class],version = 1,exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun ytVideoDao(): YoutubeDao
}