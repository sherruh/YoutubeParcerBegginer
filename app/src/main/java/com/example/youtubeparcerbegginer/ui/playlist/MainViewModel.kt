package com.example.youtubeparcerbegginer.ui.playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeparcerbegginer.model.PlaylistModel
import com.example.youtubeparcerbegginer.repository.MainRepository
import com.example.youtubeparcerbegginer.utils.App
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {


    val db = App().getInstance().getDataBase()
    fun getPlaylistData() : LiveData<PlaylistModel> {
        return MainRepository.fetchYoutubePlaylistData()
    }
    fun insertPlaylistData(model: PlaylistModel){
        viewModelScope.launch {
            db.ytVideoDao()?.insertAllPlayList(model)
        }
    }

    suspend fun getDataFromDB(): PlaylistModel {
       return db.ytVideoDao().getAllPlaylist()
    }
}