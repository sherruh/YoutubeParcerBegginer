package com.example.youtubeparcerbegginer.utils
import android.content.Context
import android.net.ConnectivityManager

class InternetHelper {

    companion object{
        fun checkInternetConnection(context: Context):Boolean{
            return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
                .activeNetworkInfo != null
        }
    }


}