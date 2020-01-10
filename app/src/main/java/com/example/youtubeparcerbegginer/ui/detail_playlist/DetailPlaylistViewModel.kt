package com.example.youtubeparcerbegginer.ui.detail_playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.youtubeparcerbegginer.model.DetailPlaylistModel
import com.example.youtubeparcerbegginer.repository.MainRepository
import com.example.youtubeparcerbegginer.utils.App


class DetailPlaylistViewModel : ViewModel() {

    val db = App().getInstance().getDataBase()
    fun fetchDetailPlaylistData(id: String): LiveData<DetailPlaylistModel>? {
        return MainRepository.fetchYoutubeDetailPlaylistData(id)

    }

    suspend fun getDetailPlaylistModel(): List<DetailPlaylistModel> {
        return db.ytVideoDao().fetchDetailPlaylist()
    }
}