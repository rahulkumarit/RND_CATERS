package com.cateresorderbooking.login

import android.content.Intent
import android.os.Bundle
import com.cateresorderbooking.R
import com.cateresorderbooking.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

/**
 * Created by SONI on 4/15/2018.
 */
class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        try {
            initial()
          } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun initial() {
        btnLogin.setOnClickListener {
        }

        txtJoin.setOnClickListener {
            startActivity(Intent())
          }

     }

}