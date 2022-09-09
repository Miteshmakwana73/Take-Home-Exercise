package com.takehomeexcercise

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    private var mContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

    public fun getAppContext(): Context? {
        return mContext
    }
}