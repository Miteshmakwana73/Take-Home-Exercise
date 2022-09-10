package com.takehomeexcercise.ui.model

class ImageData : ArrayList<ImageData.ImageDataItem>(){
    data class ImageDataItem(
        var copyright: String? = null,
        var date: String = "",
        var explanation: String = "",
        var hdurl: String = "",
        var media_type: String = "",
        var service_version: String = "",
        var title: String = "",
        var url: String = ""
    )
}