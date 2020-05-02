package com.example.android_viewmode_livedata_exmp.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android_viewmode_livedata_exmp.MainActivityVM
import java.lang.IllegalArgumentException

class MainActivityVMFactory(private val value:Int): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivityVMWithParam::class.java)){
            return MainActivityVMWithParam(value) as T
        }
        throw  IllegalArgumentException("No Such Type of View Model")
    }
}