package com.example.youtubeparcerbegginer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeparcerbegginer.R
import com.example.youtubeparcerbegginer.model.ItemsItem
import com.example.youtubeparcerbegginer.utils.loadImage
import com.squareup.picasso.Picasso

/**
 * Created by Karukes Sergey on
 */

class DetailPlaylistAdapter(val function: (ItemsItem) -> Unit) : RecyclerView.Adapter<DetailPlaylistAdapter.YouTubeViewHolder>() {


    private var list = mutableListOf<ItemsItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YouTubeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_youtube_video, parent, false)
        return YouTubeViewHolder(
            view,
            function
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: YouTubeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun updateData(newList: List<ItemsItem>?) {
        list = newList as MutableList<ItemsItem>
        notifyDataSetChanged()
    }


    class YouTubeViewHolder(itemView: View, val function: (ItemsItem) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private var image: ImageView? = null
        private var title: TextView? = null
        private var description: TextView? = null

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
            description = itemView.findViewById(R.id.description)
        }

        fun bind(item: ItemsItem) {
            image!!.loadImage(item.snippet?.thumbnails?.default?.url)
            title?.text = item.snippet.title
            description?.text = item.contentDetails?.itemCount
            itemView.setOnClickListener {
                function(item)
            }
        }

    }


}
