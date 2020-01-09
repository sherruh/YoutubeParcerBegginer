package com.example.youtubeparcerbegginer.type_converters

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.youtubeparcerbegginer.model.ItemsItem
import com.example.youtubeparcerbegginer.model.PageInfo
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class PlaylistModelTypeConverter {
    val gson = Gson()

    @TypeConverter
    fun fromItemsItem(data:String?):List<ItemsItem>{

        if(data == null){
            return Collections.emptyList()
        }
        val listType = object :TypeToken<List<ItemsItem>>(){}.type
        return gson.fromJson(data,listType)

    }

    @TypeConverter
    fun toItemsItem(objects: List<ItemsItem>):String{
        return gson.toJson(objects)
    }

    @TypeConverter
    fun fromPageInfo(value: String?): PageInfo = gson.fromJson(value,PageInfo::class.java)

    @TypeConverter
    fun toPageInfo(objects: PageInfo): String{
        return gson.toJson(objects)
    }
}