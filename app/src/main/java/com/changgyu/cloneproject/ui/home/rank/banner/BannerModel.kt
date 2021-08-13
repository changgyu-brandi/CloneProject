package com.changgyu.cloneproject.ui.home.rank.banner

import android.view.View
import android.widget.Toast
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.ItemBannerPageBinding
import com.changgyu.cloneproject.util.showLog

@EpoxyModelClass(layout = R.layout.item_banner_page)
abstract class BannerModel : EpoxyModelWithHolder<BannerModel.BannerHolder>() {

    @EpoxyAttribute
    lateinit var viewPagerAdapter: BannerPageAdapter

    @EpoxyAttribute
    lateinit var bannerList: List<BannerData>

    override fun bind(holder: BannerHolder) {
        holder.binding.apply {
            bannerPager.adapter = UltraBannerPageAdapter(bannerList)
            viewPagerAdapter.bannerList = bannerList
            bannerPager.setInfiniteLoop(true)
            bannerPager.setAutoScroll(2000)
            bannerPager.setOnClickListener {

            }
        }
    }

    inner class BannerHolder : EpoxyHolder() {

        lateinit var binding: ItemBannerPageBinding

        override fun bindView(itemView: View) {
            binding = ItemBannerPageBinding.bind(itemView)
        }

    }
}