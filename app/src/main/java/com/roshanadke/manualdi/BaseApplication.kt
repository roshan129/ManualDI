package com.roshanadke.manualdi

import android.app.Application
import com.roshanadke.manualdi.di.AppModule
import com.roshanadke.manualdi.di.AppModuleImpl

class BaseApplication: Application() {

    companion object {
        lateinit var appModule: AppModule
    }

    override fun onCreate() {
        super.onCreate()
        appModule = AppModuleImpl(this)
    }
}