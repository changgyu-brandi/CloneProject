package com.changgyu.cloneproject.ui.home.rank.product

import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.changgyu.cloneproject.R
import com.changgyu.cloneproject.databinding.ItemBannerPageBinding
import com.changgyu.cloneproject.databinding.ItemProductBinding
import com.changgyu.cloneproject.ui.home.rank.banner.BannerData
import com.changgyu.cloneproject.util.setFrescoImage
import com.changgyu.cloneproject.util.setGlideImage
import com.changgyu.cloneproject.util.showLog

@EpoxyModelClass(layout = R.layout.item_product)
abstract class ProductModel : EpoxyModelWithHolder<ProductModel.ProductHolder>() {

    @EpoxyAttribute
    lateinit var productData: ProductData

    override fun bind(holder: ProductHolder) {
        holder.binding.apply {
            productIv.setFrescoImage(productData.imageUrl)
            productTv.text = productData.name

            productIv.setOnClickListener {

            }
        }
    }

    inner class ProductHolder : EpoxyHolder() {

        lateinit var binding: ItemProductBinding

        override fun bindView(itemView: View) {
            binding = ItemProductBinding.bind(itemView)
        }

    }
}