package com.changgyu.cloneproject.ui.home.rank

import android.content.Context
import com.airbnb.epoxy.EpoxyController
import com.changgyu.cloneproject.ui.home.rank.banner.BannerData
import com.changgyu.cloneproject.ui.home.rank.banner.BannerPageAdapter
import com.changgyu.cloneproject.ui.home.rank.banner.banner
import com.changgyu.cloneproject.ui.home.rank.product.ProductData
import com.changgyu.cloneproject.ui.home.rank.product.product

class HomeRankController(private val context: Context) : EpoxyController() {
    val bannerList: ArrayList<BannerData> = arrayListOf()
    val productList: ArrayList<ProductData> = arrayListOf()

    fun setData() {
        setBanner()
        setProduct()
        requestModelBuild()
    }

    private fun setBanner() {
        for(i in 0 until 5){
            bannerList.add(BannerData(i, "http://placeimg.com/3${i}0/3${i}0/any"))
        }
    }

    private fun setProduct() {
        for(i in 0 until 10){
            productList.add(ProductData(i, "http://placeimg.com/5${i}0/5${i}0/any","product ${i}"))
        }
    }

    override fun buildModels() {
        banner {
            id("banner")
            viewPagerAdapter(BannerPageAdapter(context))
            bannerList(bannerList)
        }
        productList.forEach {
            product {
                id(it.id)
                productData(it)
            }
        }

    }

}