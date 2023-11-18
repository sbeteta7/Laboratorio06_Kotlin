package com.sebastian.beteta.poketinder_beteta4c24.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.sebastian.beteta.poketinder_beteta4c24.data.model.PokemonResponse
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ItemPokemonBinding

class PokemonAdapter (
    var list: List<PokemonResponse>,
    var callback: Callback
) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view.root)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = ItemPokemonBinding.bind(view)

        fun bind(pokemon: PokemonResponse) {
            binding.tvName.text = pokemon.name
            Glide
                .with(itemView)
                .load(pokemon.getPokemonImage())
                .into(binding.ivPokemon)
            binding.root.setOnClickListener {
                callback.onClickPokemonInformation(pokemon)
            }
        }
    }

    interface Callback {
        fun onClickPokemonInformation(pokemonResponse: PokemonResponse)
    }
}