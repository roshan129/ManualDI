package com.roshanadke.manualdi.di

import android.content.Context
import com.roshanadke.manualdi.AuthApi
import com.roshanadke.manualdi.AuthRepository
import com.roshanadke.manualdi.AuthRepositoryImpl
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppModule {

    val authApi: AuthApi
    val authRepository: AuthRepository
}

class AppModuleImpl(
    private val context: Context
) : AppModule {
    override val authApi: AuthApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://ancd/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(AuthApi::class.java)
    }

    override val authRepository: AuthRepository by lazy {
        AuthRepositoryImpl(authApi)
    }
}