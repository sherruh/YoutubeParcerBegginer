package com.example.youtubeparcerbegginer.ui.detail_playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.youtubeparcerbegginer.model.DetailPlaylistModel
import com.example.youtubeparcerbegginer.repository.MainRepository


class DetailPlaylistViewModel : ViewModel() {


    fun fetchDetailPlaylistData(id: String): LiveData<DetailPlaylistModel>? {
        return MainRepository.fetchYoutubeDetailPlaylistData(id)

    }
}