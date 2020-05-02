package com.example.android_viewmode_livedata_exmp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVM:ViewModel() {

    private  var result= MutableLiveData<Int>()
    val loadData: LiveData<Int>
        get() = result

    init {
        result.value=0
    }

    fun updateCount(){
        result.value= result.value?.plus(1)
    }
    private var count:Int=0

    fun getCount():Int{
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }

}