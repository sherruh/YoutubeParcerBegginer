package com.example.youtubeparcerbegginer.ui.playlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youtubeparcerbegginer.R
import com.example.youtubeparcerbegginer.adapter.PlaylistAdapter
import com.example.youtubeparcerbegginer.model.ItemsItem
import com.example.youtubeparcerbegginer.model.PlaylistModel
import com.example.youtubeparcerbegginer.ui.detail_playlist.DetailPlaylistActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar
    private var viewModel: MainViewModel? = null
    private var adapter: PlaylistAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initViewModel()
        initAdapter()
        fetchPlaylists()
    }

    private fun fetchPlaylists() {
        val data = viewModel?.getPlaylistData()
        data?.observe(this, Observer<PlaylistModel>{
            val model: PlaylistModel? = data.value
            when {
                model != null -> {
                    adapter?.updateData(model.items)
                }
            }
        })
    }



    private fun initAdapter() {
        recycler.layoutManager = LinearLayoutManager(this)
        adapter = PlaylistAdapter { item: ItemsItem -> onClickItem(item) }
        recycler.adapter = adapter
    }

    private fun onClickItem(item: ItemsItem) {
        DetailPlaylistActivity.startActivity(item, this)
    }

    private fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    private fun initView() {
        toolBar = findViewById(R.id.toolBar)
        toolBar.title = ""
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
}
