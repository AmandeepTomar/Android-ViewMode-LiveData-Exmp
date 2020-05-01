package com.example.android_viewmode_livedata_exmp.withdatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel:ViewModel() {
     var result=MutableLiveData<Int>()

    fun updateCount(){
        result.value= result.value?.plus(1)

        return
    }
}