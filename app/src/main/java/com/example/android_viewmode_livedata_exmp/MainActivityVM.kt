package com.example.android_viewmode_livedata_exmp

import androidx.lifecycle.ViewModel

class MainActivityVM:ViewModel() {
    private var count:Int=0

    fun getCount():Int{
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }

}