package com.takehomeexcercise.ui.activity

import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import androidx.activity.viewModels
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import com.takehomeexcercise.SCommonItemDecoration
import com.takehomeexcercise.core.BaseActivity
import com.takehomeexcercise.databinding.ActivityListingBinding
import com.takehomeexcercise.dip2px
import com.takehomeexcercise.network.Status
import com.takehomeexcercise.showSnackBarToast
import com.takehomeexcercise.ui.adapter.ImagesAdapter
import com.takehomeexcercise.ui.model.ImageData
import com.takehomeexcercise.ui.viewmodel.ListingViewModel

class ListingActivity : BaseActivity() {
    private val TAG = javaClass.simpleName
    private lateinit var binding: ActivityListingBinding
    private var mList: ArrayList<ImageData.ImageDataItem> = arrayListOf()
    private val viewModel: ListingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setObserve()
    }

    /**
     * initialize view
     */
    private fun init() {
        val propMap = SparseArray<SCommonItemDecoration.ItemDecorationProps>()
        val verticalSpace = 15f.dip2px(this)
        val horizontalSpace = 15f.dip2px(this)
        val prop2 = SCommonItemDecoration.ItemDecorationProps(
            horizontalSpace,
            verticalSpace,
            false,
            true
        )
        propMap.put(0, prop2)

        with(binding.rvImages) {
            layoutManager = GridLayoutManager(context, 2)
            itemAnimator = DefaultItemAnimator()
            addItemDecoration(SCommonItemDecoration(propMap))
            adapter = ImagesAdapter(
                context, mList,
                object : ImagesAdapter.ViewHolderClicks {
                    override fun onClickItem(
                        model: ImageData.ImageDataItem,
                        position: Int
                    ) {
                        //click of recyclerview item
                    }
                }
            )
        }

        viewModel.getImages(this, "data.json")  // data.json is name of assets json file name
    }

    private fun setObserve() {

        viewModel.getImageResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()

                    it.data?.let { list ->
                        Log.i(TAG, "success $list")
                        mList.addAll(list)
                        binding.rvImages.adapter?.notifyDataSetChanged()
                    }
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { it1 ->
                        binding.lnMain.showSnackBarToast(it.message)
                    }
                }
            }
        }
    }
}