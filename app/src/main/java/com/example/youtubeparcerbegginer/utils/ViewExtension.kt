package com.example.youtubeparcerbegginer.utils

import android.view.View
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun View.gone(){
    visibility = View.GONE
}

fun View.visible(){
    visibility = View.VISIBLE
}

fun ImageView.loadImage(url: String){
    Picasso
        .get()
        .load(url)
        .fit()
        .centerCrop()
        .into(this)
}