package com.sebastian.beteta.poketinder_beteta4c24.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sebastian.beteta.poketinder_beteta4c24.util.SharedPreferenceUtil
import com.sebastian.beteta.poketinder_beteta4c24.data.model.User
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ActivityRegisterBinding
import com.sebastian.beteta.poketinder_beteta4c24.ui.viewmodel.RegisterViewModel

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(ActivityRegisterBinding::inflate) {
    private lateinit var viewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
        viewModel.init(SharedPreferenceUtil().apply { setSharedPreference(this@RegisterActivity) })
        binding.btnRegister.setOnClickListener {
            val userId = "1"
            val userName = binding.edtUserName.text.toString()
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()
            viewModel.registerUser(userId, userName, email, password)
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.btnGoLogin.setOnClickListener {
            // Handle the button click for going to the login activity
        }
    }
}