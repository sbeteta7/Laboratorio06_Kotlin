package com.sebastian.beteta.poketinder_beteta4c24.ui.holder

import android.view.View
import com.sebastian.beteta.poketinder_beteta4c24.databinding.ItemPokemonSavedBinding

class MyPokemonsHolder(view: View):RecyclerView.ViewHolder(view) {
    private val binding = ItemPokemonSavedBinding.bind(view)

    fun bind(pokemon: MyPokemonEntity){
        with(binding){ItemPokemonSavedBinding
            tvIndex.text = formatNumberTo3Digits(pokemon.idPokemon.toInt())
            tvName.text = pokemon.name
            tvType.text= if (pokemon.isLegendary) "Legendary" else "Normal"
            Glide
                .with(itemView)
                .load(pokemon.image)
                .into(binding.ivPokemonLogo)
    }
}
    fun formatNumberTo3Digits(number:Int): String ="#${"%03d".format(number)}"