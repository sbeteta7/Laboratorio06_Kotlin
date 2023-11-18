package com.sebastian.beteta.poketinder_beteta4c24.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<B: ViewBinding>(val bindingFactory:(LayoutInflater)->B): Fragment() {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = bindingFactory(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return binding.root
    }

}