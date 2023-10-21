package com.sebastian.beteta.poketinder_beteta4c24
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<B: ViewBinding>(val bindingFactory: (LayoutInflater) -> B):AppCompatActivity() {
    lateinit var binding: B
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding=bindingFactory(layoutInflater)
        setContentView(binding.root)
    }
}