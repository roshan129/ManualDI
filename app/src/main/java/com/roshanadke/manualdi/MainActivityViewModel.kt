package com.roshanadke.manualdi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.ViewModelInitializer
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val repository: AuthRepository
): ViewModel() {


    fun login() {
        viewModelScope.launch {
            repository.login()
        }
    }

}
