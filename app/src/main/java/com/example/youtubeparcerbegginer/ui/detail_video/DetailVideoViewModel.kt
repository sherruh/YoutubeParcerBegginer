package com.example.youtubeparcerbegginer.ui.detail_video

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtubeparcerbegginer.model.DetailVideoModel
import com.example.youtubeparcerbegginer.repository.MainRepository
import com.example.youtubeparcerbegginer.utils.App
import kotlinx.coroutines.launch

class DetailVideoViewModel : ViewModel() {

    val db = App().getInstance().getDataBase()
    fun getVideoData(id: String) : LiveData<DetailVideoModel>? {
        return MainRepository.fetchVideoData(id)
    }

    fun insertDetailVideoData(model: DetailVideoModel) {
        viewModelScope.launch {
            db.ytVideoDao().insertDetailVideo(model)
        }
    }

    suspend fun getVideoDataFromDB(): List<DetailVideoModel> {
       return db.ytVideoDao().fetchDetailVideo()
    }


}
