package com.example.youtubeparcerbegginer.db

import androidx.room.Dao
import androidx.room.Insert
import com.example.youtubeparcerbegginer.model.PlaylistModel
import androidx.room.Query

@Dao
interface YoutubeDao {

    @Insert
    suspend fun insertAllPlayList(items: PlaylistModel)

    @Query("SELECT * FROM play_list")
    suspend fun getAllPlaylist():PlaylistModel
}