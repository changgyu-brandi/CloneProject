package com.changgyu.cloneproject.util

import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.facebook.drawee.drawable.ScalingUtils
import com.facebook.drawee.view.SimpleDraweeView

fun ImageView.setGlideImage(url: String) {
    Glide.with(context)
        .load(Uri.parse(url))
        .centerInside()
        .into(this)
}

fun SimpleDraweeView.setFrescoImage(url: String) {
    hierarchy.actualImageScaleType = ScalingUtils.ScaleType.CENTER_CROP
    hierarchy.roundingParams?.let {
        it.paintFilterBitmap = true
    }
    setImageURI(Uri.parse(url), null)
}