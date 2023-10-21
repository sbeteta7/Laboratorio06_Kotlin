package com.sebastian.beteta.poketinder_beteta4c24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ActivityLoginBinding
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ActivityRegisterBinding

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(ActivityRegisterBinding::inflate) {
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferenceUtil = SharedPreferenceUtil().also{
            it.setSharedPreference(this)
        }
        binding.btnRegister.setOnClickListener{
            val userId="1"
            val userName = binding.edtUserName.text.toString()
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()
            val user = User(
                userId,
                userName,
                email,
                password
            )
            sharedPreferenceUtil.saveUser(user)
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.btnGoLogin.setOnClickListener{
        }
    }
}