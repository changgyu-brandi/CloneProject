package com.changgyu.cloneproject.ui.home.rank.banner

import android.os.Handler
import android.os.Looper
import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.ItemBannerPageBinding

@EpoxyModelClass(layout = R.layout.item_banner_page)
abstract class BannerModel : EpoxyModelWithHolder<BannerModel.BannerHolder>() {

    @EpoxyAttribute
    lateinit var viewPagerAdapter: BannerPageAdapter

    @EpoxyAttribute
    lateinit var bannerList: List<BannerData>
    lateinit var bannerPageRunnble: Runnable

    override fun bind(holder: BannerHolder) {
        holder.binding.apply {
            bannerPager.adapter = viewPagerAdapter
            viewPagerAdapter.bannerList = bannerList

            val bannerPageHandler = Handler(Looper.getMainLooper())
            if(::bannerPageRunnble.isInitialized.not()){
                bannerPageRunnble = Runnable {
                    bannerPager.currentItem = (bannerPager.currentItem+1)%bannerList.size
                    bannerPageHandler.postDelayed(bannerPageRunnble,2000)
                }
                bannerPageHandler.postDelayed(bannerPageRunnble,2000)
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