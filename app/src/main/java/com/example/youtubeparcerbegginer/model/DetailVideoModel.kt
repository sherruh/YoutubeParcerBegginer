package com.example.youtubeparcerbegginer.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.youtubeparcerbegginer.type_converters.PlaylistModelTypeConverter
import com.google.gson.annotations.SerializedName

@Entity(tableName = "video_model")
@TypeConverters(PlaylistModelTypeConverter::class)
data class DetailVideoModel(@SerializedName("kind")
                            @PrimaryKey
                            val kind: String = "",
                            @SerializedName("pageInfo")
                            val pageInfo: PageInfo,
                            @SerializedName("etag")
                            val etag: String = "",
                            @SerializedName("items")
                            val items: List<ItemsItem>?)