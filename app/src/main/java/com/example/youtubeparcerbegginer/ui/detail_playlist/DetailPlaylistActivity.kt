package com.example.youtubeparcerbegginer.ui.detail_playlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import com.example.youtubeparcerbegginer.R
import com.example.youtubeparcerbegginer.model.ItemsItem
import android.content.Context
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeparcerbegginer.adapter.DetailPlaylistAdapter
import com.example.youtubeparcerbegginer.model.DetailPlaylistModel
import kotlinx.android.synthetic.main.activity_detail_playlist.*

class DetailPlaylistActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar

    private lateinit var viewModel: DetailPlaylistViewModel
    private lateinit var adapter: DetailPlaylistAdapter

    private var id: String? = null
    private var title: String? = null
    private var description: String? = null


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
        viewModel = ViewModelProviders.of(this).get(DetailPlaylistViewModel::class.java)

        initAdapter()
        getIntentData()
        subscribeToViewModel()
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

    private fun getIntentData() {
        id = intent?.getStringExtra("id")
        title = intent?.getStringExtra("title")
        description = intent?.getStringExtra("etag")
    }

    private fun initAdapter() {
        recycler.layoutManager = LinearLayoutManager(this)
        adapter = DetailPlaylistAdapter {item: ItemsItem -> click(item)}
        recycler.adapter = adapter
    }

    private fun click(item: ItemsItem) {
       /* val intent = Intent(this, DetailVideoActivity::class.java)
        intent.putExtra("playlistId", id)
        intent.putExtra("videoId", item.snippet.resourceId.videoId)
        startActivity(intent)*/
    }


    private fun subscribeToViewModel() {

        val data = id?.let { viewModel.fetchDetailPlaylistData(it) }
        data?.observe(this, Observer<DetailPlaylistModel> {
            if (data.value != null) {
                updateViews(data.value!!)
            }
        })
    }

    private fun updateViews(it: DetailPlaylistModel) {
        adapter.updateData(it.items)
    }
}
