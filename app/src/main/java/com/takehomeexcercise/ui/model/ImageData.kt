package com.takehomeexcercise.ui.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ImageData : ArrayList<ImageData.ImageDataItem>(), Parcelable {
    @Parcelize
    data class ImageDataItem(
        var copyright: String? = null,
        var date: String = "",
        var explanation: String = "",
        var hdurl: String = "",
        var media_type: String = "",
        var service_version: String = "",
        var title: String = "",
        var url: String = ""
    ): Parcelable
}