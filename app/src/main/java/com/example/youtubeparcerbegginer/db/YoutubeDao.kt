package com.example.youtubeparcerbegginer.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.youtubeparcerbegginer.model.PlaylistModel
import androidx.room.Query
import com.example.youtubeparcerbegginer.model.DetailPlaylistModel

@Dao
interface YoutubeDao {

    @Insert
    suspend fun insertAllPlayList(items: PlaylistModel)

    @Query("SELECT * FROM play_list")
    suspend fun getAllPlaylist():PlaylistModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDetailPlaylistData(item: DetailPlaylistModel)

    @Query("SELECT * FROM detail_playlist")
    suspend fun fetchDetailPlaylist(): List<DetailPlaylistModel>
}