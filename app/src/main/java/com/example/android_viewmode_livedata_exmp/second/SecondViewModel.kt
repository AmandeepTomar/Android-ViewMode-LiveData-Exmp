package com.example.android_viewmode_livedata_exmp.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel:ViewModel() {
   private  var result=MutableLiveData<Int>()
    val loadData:LiveData<Int>
    get() = result

    init {
        result.value=0
    }

    fun updateCount(){
        result.value= result.value?.plus(1)
    }
}