package com.example.youtubeparcerbegginer.ui.detail_video

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.youtubeparcerbegginer.R
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.util.SparseArray
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.youtubeparcerbegginer.model.DetailVideoModel
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.net.toUri
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import at.huber.youtubeExtractor.VideoMeta
import at.huber.youtubeExtractor.YouTubeExtractor
import at.huber.youtubeExtractor.YtFile
import com.example.youtubeparcerbegginer.adapter.DownloadDialogAdapter
import com.example.youtubeparcerbegginer.adapter.PlaylistAdapter
import com.example.youtubeparcerbegginer.model.YtVideo
import com.example.youtubeparcerbegginer.utils.*
import com.google.android.exoplayer2.Player
import kotlinx.android.synthetic.main.activity_detail_video.*
import kotlinx.android.synthetic.main.internet_layout.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DetailVideoActivity : AppCompatActivity(), CallBacks.playerCallBack {

    companion object{
        fun startActivity(playlistId: String, videoId: String, context: Context){
            val intent = Intent(context,DetailVideoActivity::class.java)
            intent.putExtra("playlistId",playlistId)
            intent.putExtra("videoId",videoId)
            context.startActivity(intent)
        }
    }

    private var viewModel: DetailVideoViewModel? = null
    private var mModel: DetailVideoModel? = null
    private var adapter: PlaylistAdapter? = null

    private val ITAG_FOR_AUDIO = 140

    private var writePermission = false
    private var selectedVideoQuality: String? = null
    private var selectedVideoExt: String? = null
    private var fileVideo: YtVideo? = null
    private var fileName: String? = null

    private lateinit var player: Player
    private lateinit var playerManager: PlayerManager

    private lateinit var dialogDownloadButton: Button
    private lateinit var dialogRecyclerView: RecyclerView

    private lateinit var dialogAdapter: DownloadDialogAdapter
    private var formatsToShowList: MutableList<YtVideo?>? = null
    private lateinit var downloadMaster: DownloadMaster

    lateinit var playlistId: String
    lateinit var videoId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initNormalView()

    }

    private fun initNormalView() {
        setContentView(R.layout.activity_detail_video)
        viewModel = ViewModelProviders.of(this).get(DetailVideoViewModel::class.java)
        formatsToShowList = ArrayList()
        playerManager = PlayerManager.getSharedInstance(this)
        player = playerManager.playerView.player
        downloadMaster = DownloadMaster()
        getIntentData()
        initView()

        fetchDetailVideo()
    }

    private fun fetchDetailVideo() {

        //var model = DetailVideoModel("",")
        CoroutineScope(Dispatchers.Main).launch {
            val model = viewModel?.getVideoDataFromDB()
            if (model != null && !model.isNullOrEmpty()){
                for (m in model){
                    if (m.items!![0]?.id == videoId)
                        {
                            mModel = m
                            setData(mModel!!)
                            break
                        }
                }
            }
        }

        if(InternetHelper.checkInternetConnection(this)){
            getDataFromRemote()
        }


    }

    private fun initInternetView() {
        setContentView(R.layout.internet_layout)
        image_try_again.setOnClickListener {
            if (InternetHelper.checkInternetConnection(this)) initNormalView()
            else if(mModel == null) initInternetView()
        }
    }

    private fun getDataFromRemote(){
        val data = videoId?.let { viewModel?.getVideoData(it) }
        data?.observe(this, Observer<DetailVideoModel> {
            val model: DetailVideoModel? = data.value
            when {
                model != null -> {
                    setData(model)
                    viewModel?.insertDetailVideoData(model)
                    mModel = model
                }
            }
        })
    }

    private fun setData(model: DetailVideoModel) {
        tv_title.text = model.items?.get(0)?.snippet?.title
        tv_description.text = model.items?.get(0)?.snippet?.description
        fileName = model.items?.get(0)?.snippet?.title
        tv_description.text = model.items?.get(0)?.snippet?.description
        val link = model.items?.get(0)?.id.toString()
        if (InternetHelper.checkInternetConnection(this))actualLink(link)
    }

    @SuppressLint("StaticFieldLeak")
    private fun actualLink(link: String) {
        object : YouTubeExtractor(this) {
            public override fun onExtractionComplete(ytFiles: SparseArray<YtFile>?, vMeta: VideoMeta) {

                formatsToShowList = mutableListOf()
                var i = 0
                var itag: Int
                if (ytFiles != null) {
                    while (i < ytFiles.size()) {
                        itag = ytFiles.keyAt(i)
                        val ytFile = ytFiles.get(itag)

                        if (ytFile.format.height == -1 || ytFile.format.height >= 360) {
                            addFormatToList(ytFile, ytFiles)
                        }
                        i++
                    }
                }
                (formatsToShowList)?.sortWith(Comparator {
                        lhs, rhs -> lhs!!.height - rhs!!.height
                })

                val yotutubeUrl: YtVideo? = formatsToShowList?.get(formatsToShowList!!.lastIndex)
                if (yotutubeUrl?.videoFile?.url != null) {
                    playVideo(yotutubeUrl.videoFile?.url!!)
                }
            }
        }.extract(link, true, true)

    }

    private fun playVideo(url: String) {
        player_view?.player = player
        PlayerManager.getSharedInstance(this).playStream(url)
        PlayerManager.getSharedInstance(this).setPlayerListener(this)
    }

    private fun addFormatToList(ytFile: YtFile?, ytFiles: SparseArray<YtFile>) {
        val height = ytFile?.format!!.height
        if (height != -1) {
            for (frVideo in this.formatsToShowList!!) {
                if (frVideo?.height == height && (frVideo?.videoFile == null || frVideo.videoFile!!.format.fps == ytFile.format.fps)) {
                    return
                }
            }
        }
        val frVideo = YtVideo()
        frVideo.height = height
        if (ytFile?.format?.isDashContainer!!) {
            if (height > 0) {
                frVideo.videoFile = ytFile
                frVideo.audioFile = ytFiles.get(ITAG_FOR_AUDIO)
            } else {
                frVideo.audioFile = ytFile
            }
        } else {
            frVideo.videoFile = ytFile
        }
        formatsToShowList!!.add(frVideo)
    }

    private fun initView() {
        val toolBar: Toolbar  = findViewById(R.id.toolBar_redirected)
        toolBar.title = ""
        setSupportActionBar(toolBar)
        btn_download.setOnClickListener {
            checkRequestPermission()
            showDownloadDialog()
        }

    }

    private fun showDownloadDialog() {
        val builder = AlertDialog.Builder(this, R.style.DownloadDialog)

        val view = layoutInflater.inflate(R.layout.alert_download_dialog, null)
        builder.setView(view)
        dialogDownloadButton = view.findViewById(R.id.btn_alert_download)
        dialogRecyclerView = view.findViewById(R.id.alert_recycler_view)

        initDialogAdapter()
        dialogAdapter.updateData(formatsToShowList)
        val alert = builder.create()
        alert.show()
        downloadAction(alert)
    }

    private fun downloadAction(builder: AlertDialog) {
        dialogDownloadButton.setOnClickListener {
            var downloadName = fileName!!
            downloadName = downloadName.replace("[\\\\><\"|*?%:#/]".toRegex(), "")
            var downloadIds = ""

            try {
                if (fileVideo?.videoFile != null) {
                    downloadIds += DownloadMaster().downloadFile(
                        this,
                        fileVideo?.videoFile!!.url,
                        downloadName + "." + fileVideo?.videoFile!!.format.ext,
                        downloadName + "." + fileVideo?.videoFile!!.format.ext

                    )
                    downloadIds += "-"
                }
                if (fileVideo?.audioFile != null) {
                    downloadIds += DownloadMaster().downloadFile(
                        this,
                        fileVideo?.videoFile!!.url,
                        downloadName + "." + fileVideo?.videoFile!!.format.ext,
                        downloadName + "." + fileVideo?.videoFile!!.format.ext
                    )
                }

            } catch (e: Exception) {

            }
            builder.dismiss()
        }
    }

    private fun initDialogAdapter() {
        dialogAdapter = DownloadDialogAdapter { item: YtVideo -> downloadClickItem(item)}
        dialogRecyclerView.layoutManager = LinearLayoutManager(applicationContext)
        dialogRecyclerView.adapter = dialogAdapter
    }

    private fun downloadClickItem(item: YtVideo) {
        selectedVideoQuality = item.videoFile?.url
        selectedVideoExt = item.videoFile?.format?.ext
        fileVideo = item
    }

    private fun checkRequestPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE),
                1024
            )
        } else {
            writePermission = true
        }
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_back -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPlayingEnd() {

    }

    override fun onItemClickOnItem(albumId: Int) {

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            player_view.layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
            player_view.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            player_view.layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
            player_view.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT

        }
    }
}
