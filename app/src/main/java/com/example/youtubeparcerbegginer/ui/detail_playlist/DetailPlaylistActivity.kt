package com.example.youtubeparcerbegginer.ui.detail_playlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import com.example.youtubeparcerbegginer.R
import com.example.youtubeparcerbegginer.model.ItemsItem
import android.content.Context
import android.content.Intent

class DetailPlaylistActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar

    companion object{
        fun startActivity(item: ItemsItem, context: Context) {
            val intent = Intent(context, DetailPlaylistActivity::class.java)
            intent.putExtra("id", item.id)
            intent.putExtra("title", item.snippet.title)
            intent.putExtra("channelTitle", item.snippet.channelId)
            intent.putExtra("etag", item.etag)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_playlist)

        initView()
    }

    private fun initView() {
        toolBar = findViewById(R.id.toolBar_redirected)
        toolBar.title = ""
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.playlist_details_menu,menu)
        return true
    }
}
