package com.example.youtubeparcerbegginer.utils

import android.util.Log

class Logger {

    companion object{

        val TAG = "ololo"

        fun d(text: String){
            Log.d(TAG, text)
        }
    }
}