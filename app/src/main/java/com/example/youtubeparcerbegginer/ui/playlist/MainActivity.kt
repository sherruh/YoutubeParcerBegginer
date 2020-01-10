package com.example.youtubeparcerbegginer.ui.playlist

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
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
import com.example.youtubeparcerbegginer.utils.Logger
import com.example.youtubeparcerbegginer.utils.gone
import com.example.youtubeparcerbegginer.utils.visible
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.internet_layout.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private var viewModel: MainViewModel? = null
    private var adapter: PlaylistAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        startSomeView()

    }

    private fun startSomeView() {
        if(checkConnection()) startNormalView()
        else checkLocalData()
    }

    private fun startNormalView() {
        setContentView(R.layout.activity_main)
        initView()
        initAdapter()
        getDataFromDataBase()
        fetchPlaylists()
    }

    private fun initInternetLayout() {
        setContentView(R.layout.internet_layout)
        image_try_again.setOnClickListener {
            if(checkConnection()) { startNormalView()}
        }
    }

    private fun checkConnection(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE)
        return if (connectivityManager is ConnectivityManager) {
            val networkInfo: NetworkInfo? = connectivityManager.activeNetworkInfo
            networkInfo?.isConnected ?: false
        } else false
    }

    private fun fetchPlaylists() {
        val data = viewModel?.getPlaylistData()
        progressBar.visible()
        data?.observe(this, Observer<PlaylistModel>{
            val model: PlaylistModel? = data.value
            when {
                model != null -> {
                    updateAdapter(model)
                    updateDataBasePlaylistModel(model)
                }
            }
            progressBar.gone()
        })
    }

    private fun getDataFromDataBase() {
        CoroutineScope(Dispatchers.Main).launch {
            val model = viewModel?.getDataFromDB()
            if(model != null && !model.items.isNullOrEmpty()){
                Logger.d(model.items.size.toString())
                updateAdapter(model)
            }
        }
    }

    private fun checkLocalData(){
        CoroutineScope(Dispatchers.Main).launch {
            val model = viewModel?.getDataFromDB()
            if(model != null && !model.items.isNullOrEmpty())
                startNormalView()
            else initInternetLayout()
        }
    }


    private fun updateAdapter(model: PlaylistModel) {
        adapter?.updateData(model.items)
    }

    private fun updateDataBasePlaylistModel(model: PlaylistModel) {
        viewModel?.insertPlaylistData(model)
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
        val toolBar: Toolbar = findViewById(R.id.toolBar)
        toolBar.title = ""
        setSupportActionBar(toolBar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = getMenuInflater()
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }
}
