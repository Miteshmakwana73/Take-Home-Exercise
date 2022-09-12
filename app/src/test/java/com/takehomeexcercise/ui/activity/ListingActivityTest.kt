package com.takehomeexcercise.ui.activity

import com.google.common.truth.Truth.assertThat
import com.takehomeexcercise.ui.model.ImageData
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ListingActivityTest{

    @Test
    fun isListHaveData() {
        val modelData =  ImageData.ImageDataItem()
        val mList: ArrayList<ImageData.ImageDataItem> =
            arrayListOf(modelData, modelData, modelData, modelData)

        val result = ListingActivity.isListNotEmpty(mList)
        assertThat(result).isEqualTo(true)
    }

    @Test
    fun isListNoteHaveData() {
        val mList: ArrayList<ImageData.ImageDataItem> = arrayListOf()

        val result = ListingActivity.isListNotEmpty(mList)
        assertThat(result).isFalse()
    }
}