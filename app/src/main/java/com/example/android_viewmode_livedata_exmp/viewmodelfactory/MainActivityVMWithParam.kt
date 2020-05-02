package com.example.android_viewmode_livedata_exmp.viewmodelfactory

import androidx.lifecycle.ViewModel

class MainActivityVMWithParam(private var count:Int):ViewModel() {

    fun getCount(): Int {
        return count
    }
    fun getUpdatedCount(): Int {
        return ++count
    }

}