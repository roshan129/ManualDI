package com.roshanadke.manualdi

import android.util.Log

class AuthRepositoryImpl(
    private val authApi: AuthApi
): AuthRepository {
    override fun login() {
        //authApi.login()
        Log.d("TAG", "login: logged in")

    }

}