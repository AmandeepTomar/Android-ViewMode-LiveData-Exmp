package com.example.android_viewmode_livedata_exmp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.android_viewmode_livedata_exmp.second.SecondActivity
import com.example.android_viewmode_livedata_exmp.viewmodelfactory.MainActivityVMFactory
import com.example.android_viewmode_livedata_exmp.viewmodelfactory.MainActivityVMWithParam
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     //   private lateinit var viewModel:MainActivityVM
        private lateinit var viewModel:MainActivityVMWithParam
    private lateinit var viewModelFactory:MainActivityVMFactory
    private var count:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelFactory= MainActivityVMFactory(10)
        viewModel=ViewModelProvider(this,viewModelFactory).get(MainActivityVMWithParam::class.java)
      //  viewModel=ViewModelProvider(this).get(MainActivityVM::class.java)

        // With view model
        txtCount.text=viewModel.getCount().toString()
        buttonCount.setOnClickListener {
            txtCount.text=viewModel.getUpdatedCount().toString()
        }
        buttonSecondActivity.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
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
