package com.sebastian.beteta.poketinder_beteta4c24.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.sebastian.beteta.poketinder_beteta4c24.data.database.entities.MyPokemonEntity
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ItemPokemonSavedBinding
import com.sebastian.beteta.poketinder_beteta4c24.ui.holder.MyPokemonsHolder

class MyPokemonsAdapter(val list:List<MyPokemonEntity>):
    RecyclerView.Adapter<MyPokemonHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewtype: Int): MyPokemonsHolder{
            val view = ItemPokemonSavedBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return MyPokemonsHolder((view.root))
        }
        override fun onBindViewHolder(holder:MyPokemonsHolder,position: Int){
            val item = list[position]
            holder.bind(item)
        }

        override fun getItemCount(): Int =list.size
}