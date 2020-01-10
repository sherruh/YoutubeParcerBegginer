package com.example.youtubeparcerbegginer.ui.detail_video

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.youtubeparcerbegginer.model.DetailVideoModel
import com.example.youtubeparcerbegginer.repository.MainRepository

class DetailVideoViewModel : ViewModel() {

    fun getVideoData(id: String) : LiveData<DetailVideoModel>? {
        return MainRepository.fetchVideoData(id)
    }

}
