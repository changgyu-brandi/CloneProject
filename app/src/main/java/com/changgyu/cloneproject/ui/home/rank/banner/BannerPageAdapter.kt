package com.changgyu.cloneproject.ui.home.rank.banner

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.changgyu.cloneproject.databinding.ItemBannerImageBinding
import com.changgyu.cloneproject.util.setFrescoImage

class BannerPageAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var bannerList : List<BannerData> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val binding = ItemBannerImageBinding.inflate(LayoutInflater.from(context),parent,false)
        return BannerImageHolder(binding)
    }

    override fun getItemCount(): Int = bannerList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is BannerImageHolder ->{
                holder.bind(bannerList[position])
            }
        }
    }

    inner class BannerImageHolder(val binding : ItemBannerImageBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(data : BannerData){
            binding.bannerIv.setFrescoImage(data.imageUrl)
        }

    }


}