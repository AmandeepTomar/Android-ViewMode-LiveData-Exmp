package com.example.android_viewmode_livedata_exmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        private lateinit var viewModel:MainActivityVM
    private var count:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityVM::class.java)

        // With view model
        txtCount.text=viewModel.getCount().toString()
        buttonCount.setOnClickListener {
            txtCount.text=viewModel.getUpdatedCount().toString()
        }

        // Without view model
     /*   txtCount.text=getCount().toString()
        buttonCount.setOnClickListener {
            txtCount.text=getUpdatedCount().toString()
        }*/
    }


    // with the help of view model our app can survive the screen rotation configuration changes.
    // if we are not using the view model , As we change the screen rotation changes the cont will be 0 again as we know after rotation Activity will re create so
    // cont will be 0.

    fun getCount():Int{
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}
