package com.example.youtubeparcerbegginer.utils;

/**
 * Created by Karukes Sergey on 28/11/2019
 */
public interface CallBacks {
    void callbackObserver(Object object);

    interface playerCallBack {
        void onItemClickOnItem(int albumId);
        void onPlayingEnd();
    }
}

