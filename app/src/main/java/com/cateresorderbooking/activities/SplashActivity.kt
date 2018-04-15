package com.cateresorderbooking.activities

import android.content.Intent
import android.os.Bundle
import com.cateresorderbooking.R
import com.cateresorderbooking.login.LoginActivity

/**
 * Created by SONI on 4/15/2018.
 */
class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        try {
            initial()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun initial() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()

    }

}