package com.example.android_viewmode_livedata_exmp.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.android_viewmode_livedata_exmp.R
import com.example.android_viewmode_livedata_exmp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var viewModel:SecondViewModel
    private lateinit var viewModelFactory:SecondViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_second)
        binding.lifecycleOwner=this
        viewModelFactory= SecondViewModelFactory()
        viewModel=ViewModelProvider(this,viewModelFactory).get(SecondViewModel::class.java)
        binding.viewModel=viewModel
    }
}
