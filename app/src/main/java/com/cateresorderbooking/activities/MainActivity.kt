package com.cateresorderbooking.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.cateresorderbooking.R

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {

         } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    override fun initial() {

    }

}
