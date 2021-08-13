package com.changgyu.cloneproject

import android.app.Application
import android.graphics.Bitmap
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.imagepipeline.core.ImageTranscoderType
import com.facebook.imagepipeline.core.MemoryChunkType
import timber.log.Timber

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        val config = ImagePipelineConfig.newBuilder(this)
            .setBitmapsConfig(Bitmap.Config.ARGB_8888)
            .setDownsampleEnabled(true)
            .setMemoryChunkType(MemoryChunkType.BUFFER_MEMORY)
            .setImageTranscoderType(ImageTranscoderType.JAVA_TRANSCODER)
            .build()
        Fresco.initialize(this, config)
    }
}