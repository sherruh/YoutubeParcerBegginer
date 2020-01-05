package com.example.youtubeparcerbegginer.ui.playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.youtubeparcerbegginer.model.PlaylistModel
import com.example.youtubeparcerbegginer.repository.MainRepository

class MainViewModel : ViewModel() {

    fun getPlaylistData() : LiveData<PlaylistModel> {
        return MainRepository.fetchYoutubePlaylistData()
    }
}