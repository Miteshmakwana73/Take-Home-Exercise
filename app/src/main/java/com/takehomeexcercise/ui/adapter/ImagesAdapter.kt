package com.takehomeexcercise.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.takehomeexcercise.databinding.RawImageBinding
import com.takehomeexcercise.loadImage
import com.takehomeexcercise.ui.model.ImageData

/**
 * Image list adapter : Show Image list.
 */
class ImagesAdapter(
    private val context: Context,
    private val mList: ArrayList<ImageData.ImageDataItem>,
    private val viewHolderClicks: ViewHolderClicks,
) : RecyclerView.Adapter<ImagesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RawImageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = mList[holder.adapterPosition]
        try {
            holder.viewBinding.tvTitle.text = model.title
            holder.viewBinding.imgBg.loadImage(model.url)
            holder.itemView.setOnClickListener {
                viewHolderClicks.onClickItem(model, holder.adapterPosition)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    class ViewHolder(
        var viewBinding: RawImageBinding
    ) : RecyclerView.ViewHolder(viewBinding.root)

    interface ViewHolderClicks {
        fun onClickItem(model: ImageData.ImageDataItem, position: Int)
    }
}
