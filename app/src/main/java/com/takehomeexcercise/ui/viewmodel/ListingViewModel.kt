package com.takehomeexcercise.ui.viewmodel

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.takehomeexcercise.utils.gsonConvert
import com.takehomeexcercise.network.Resource
import com.takehomeexcercise.ui.model.ImageData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListingViewModel @Inject constructor(
// specify repo is required in my case not required
) : ViewModel() {
    private val _getImagesResponse: MutableLiveData<Resource<ImageData>> =
        MutableLiveData()
    val getImageResponse: LiveData<Resource<ImageData>> get() = _getImagesResponse

    fun getImages(
        activity: Activity,
        filename: String
    ) = viewModelScope.launch {
        _getImagesResponse.value = Resource.loading(null)

        try {
            val jsonData = activity.assets.open(filename).bufferedReader().use { it.readText() }
            val imageList = jsonData.gsonConvert<ImageData>()
            _getImagesResponse.postValue(Resource.success(imageList))
        } catch (e: Exception) {
            _getImagesResponse.postValue(Resource.error(e.message.toString(), null))
        }

    }

}