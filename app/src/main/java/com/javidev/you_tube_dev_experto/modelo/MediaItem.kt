package com.javidev.you_tube_dev_experto.modelo

import java.lang.reflect.Type
import java.net.Proxy

data class MediaItem(
    val id: Int,
    val title:String,
    val imagen: String,
    val type: Type

){
    enum class Type { VIDEO,FOTO}
}

fun getItem()= (1..9).map {
    MediaItem(
        id = it,
        title = "Title $it",
        imagen = "https://picsum.photos/${it}00/${it}00",
        type = if (it % 3 == 0) MediaItem.Type.VIDEO else MediaItem.Type.FOTO
    )
}