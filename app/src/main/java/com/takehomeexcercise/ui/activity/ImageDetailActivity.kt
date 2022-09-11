package com.takehomeexcercise.ui.activity

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.takehomeexcercise.core.BaseActivity
import com.takehomeexcercise.databinding.ActivityImageDetailBinding
import com.takehomeexcercise.ui.adapter.ImageDetailAdapter
import com.takehomeexcercise.ui.model.ImageData

class ImageDetailActivity : BaseActivity() {
    private val TAG = javaClass.simpleName
    private lateinit var binding: ActivityImageDetailBinding
    private var mList: ArrayList<ImageData.ImageDataItem> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setClickListener()
    }

    /**
     * initialize view
     */
    private fun init() {
        mList = intent.getParcelableArrayListExtra("list")!!

        with(binding.rvDetails) {
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            adapter = ImageDetailAdapter(
                context, mList,
                object : ImageDetailAdapter.ViewHolderClicks {
                    override fun onClickItem(
                        model: ImageData.ImageDataItem,
                        position: Int
                    ) {
                        //click of recyclerview item
                    }
                }
            )
        }
        binding.rvDetails.currentItem = intent.getIntExtra("position", 0)

    }

    /**
     * manage click listener of view
     */
    private fun setClickListener() {
        binding.imgBack.setOnClickListener {
            onBackPressed()
        }
    }

}