package com.takehomeexcercise.ui.viewmodel

import android.app.Activity
import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth
import com.takehomeexcercise.getOrAwaitValue
import junit.framework.TestCase
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
internal class ListingViewModelTest :TestCase(){
    private lateinit var viewModel: ListingViewModel
    private lateinit var activity: Activity

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    override fun setUp() {
        super.setUp()
        viewModel = ListingViewModel()
        val context = ApplicationProvider.getApplicationContext<Context>()
        activity = context as Activity

    }

    @Test
    fun testViewmodel() {
        viewModel.getImages(activity,"data.json")
        val result = viewModel.getImageResponse.getOrAwaitValue().data!!.find {
            // comparing with static data
            it.title == "M27: The Dumbbell Nebula" && it.copyright == "Steve Mazlin"
        }

        Truth.assertThat(result != null).isTrue()
    }
}