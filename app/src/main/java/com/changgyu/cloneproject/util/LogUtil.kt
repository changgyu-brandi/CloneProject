package com.changgyu.cloneproject.util

import timber.log.Timber

fun showLog(message: Any){
    Timber.d(message.toString())
}