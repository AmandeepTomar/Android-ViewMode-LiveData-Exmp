package com.example.android_viewmode_livedata_exmp.withdatabinding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class SecondViewModelFactory :ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SecondViewModel::class.java))
        {
            return SecondViewModel() as T
        }
        throw IllegalArgumentException("No Such ViewModelFound")

    }
}