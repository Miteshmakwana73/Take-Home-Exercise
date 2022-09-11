package com.takehomeexcercise.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.takehomeexcercise.addReadMoreText
import com.takehomeexcercise.changeDateFormat
import com.takehomeexcercise.databinding.RawImageDetailBinding
import com.takehomeexcercise.loadImage
import com.takehomeexcercise.ui.model.ImageData

/**
 * Details of image viewpager2 adapter : Show image details list.
 */
class ImageDetailAdapter(
    private val context: Context,
    private val mList: ArrayList<ImageData.ImageDataItem>,
    private val viewHolderClicks: ViewHolderClicks,
) : RecyclerView.Adapter<ImageDetailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RawImageDetailBinding.inflate(
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
            holder.viewBinding.tvDate.text =
                model.date.changeDateFormat("yyyy-MM-dd", "MMM dd, yyyy")
            holder.viewBinding.tvCopyright.text = model.copyright
            holder.viewBinding.tvDetails.addReadMoreText(model.explanation)
            holder.viewBinding.imgBg.loadImage(model.hdurl)
            holder.itemView.setOnClickListener {
                viewHolderClicks.onClickItem(model, holder.adapterPosition)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    class ViewHolder(
        var viewBinding: RawImageDetailBinding
    ) : RecyclerView.ViewHolder(viewBinding.root)

    interface ViewHolderClicks {
        fun onClickItem(model: ImageData.ImageDataItem, position: Int)
    }
}
