package com.changgyu.cloneproject.ui.home.rank.banner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.ItemBannerImageBinding
import com.changgyu.cloneproject.util.setFrescoImage
import com.changgyu.cloneproject.util.setGlideImage

class UltraBannerPageAdapter(private val bannerList : List<BannerData> ) : PagerAdapter() {

    override fun getCount(): Int {
        return bannerList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view =
            LayoutInflater.from(container.context)
                .inflate(R.layout.item_banner_image, container, false)
        val binding: ItemBannerImageBinding = ItemBannerImageBinding.bind(view)
        val imageView = binding.bannerIv
        val dataBean = bannerList[position]
        imageView.setFrescoImage(bannerList[position].imageUrl)
        container.addView(view)

        return view
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}