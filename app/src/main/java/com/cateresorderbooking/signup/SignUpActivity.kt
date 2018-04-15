package com.cateresorderbooking.signup

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.cateresorderbooking.R
import com.cateresorderbooking.activities.BaseActivity

/**
 * Created by SONI on 4/15/2018.
 */
class SignUpActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        try {
            initial()
        } catch (e: Exception) {
        }
    }

    override fun initial() {


    }
}