package com.cateresorderbooking.login

/**
 * Created by SONI on 4/15/2018.
 */
interface LoginContractor {

    interface LoginView {
        fun getValidationMessage(msg: String)
        fun successLogin()
    }

    interface LoginPresenter {

    }

    interface LoginModel {

    }


}