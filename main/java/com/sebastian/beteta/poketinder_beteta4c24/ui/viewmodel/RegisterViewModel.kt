package com.sebastian.beteta.poketinder_beteta4c24.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.sebastian.beteta.poketinder_beteta4c24.data.model.User
import com.sebastian.beteta.poketinder_beteta4c24.util.SharedPreferenceUtil

class RegisterViewModel: ViewModel() {
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    fun init(sharedPreferenceUtil: SharedPreferenceUtil) {
        this.sharedPreferenceUtil = sharedPreferenceUtil
    }

    fun registerUser(userId: String, userName: String, email: String, password: String) {
        val user = User(userId, userName, email, password)
        sharedPreferenceUtil.saveUser(user)
    }
}
