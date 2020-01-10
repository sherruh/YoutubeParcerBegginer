package com.example.youtubeparcerbegginer.ui.detail_video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youtubeparcerbegginer.R
import android.content.Context
import android.content.Intent
import android.view.Menu
import com.example.youtubeparcerbegginer.model.DetailVideoModel
import com.example.youtubeparcerbegginer.model.ItemsItem
import androidx.appcompat.widget.Toolbar


class DetailVideoActivity : AppCompatActivity() {

    companion object{
        fun startActivity(playlistId: String, videoId: String, context: Context){
            val intent = Intent(context,DetailVideoActivity::class.java)
            intent.putExtra("playlistId",playlistId)
            intent.putExtra("videoId",videoId)
            context.startActivity(intent)
        }
    }

    lateinit var playlistId: String
    lateinit var videoId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_video)
        getIntentData()
        initView()
    }

    private fun initView() {
        val toolBar: Toolbar  = findViewById(R.id.toolBar_redirected)
        toolBar.title = ""
        setSupportActionBar(toolBar)

    }

    private fun getIntentData() {
        playlistId = intent.getStringExtra("playlistId")
        videoId = intent.getStringExtra("videoId")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.playlist_details_menu,menu)
        return true
    }
}
