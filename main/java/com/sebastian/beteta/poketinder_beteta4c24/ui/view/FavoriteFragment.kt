package com.sebastian.beteta.poketinder_beteta4c24.ui.view

import com.sebastian.beteta.poketinder_beteta4c24.databinding.FragmentFavoriteBinding
import com.sebastian.beteta.poketinder_beteta4c24.ui.adapter.MyPokemonsAdapter
import com.sebastian.beteta.poketinder_beteta4c24.ui.holder.MyPokemonsHolder
import com.sebastian.beteta.poketinder_beteta4c24.ui.viewmodel.FavoriteViewModel

class FavoriteFragment: BaseFragment
<FragmentFavoriteBinding>(FragmentFavoriteBinding::inflate){

    private val favouriteViewModel:FavoriteViewModel by viewModels()
    private var listMyPokemon = mutableListOf<MyPokemonsEntity>()
    private val adapter by lazy { MyPokemonsAdapter(listMyPokemon) }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        favoriteViewModel.getMyPokemons(requireContext())
        binding.rvPokemons.adapter = adapter

        favoriteViewModel.myPokemonList.observe(this){
            listMyPokemon.addAll(it)
            adapter.notifyDataSetChanged()
        }

        binding.floatingActionDelete.setOnClickListener(
            favoriteViewModel.deleteAllPokemon(requireContext())
        )


    }

}
