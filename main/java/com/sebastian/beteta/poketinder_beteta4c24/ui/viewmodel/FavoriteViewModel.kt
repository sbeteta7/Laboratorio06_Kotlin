package com.sebastian.beteta.poketinder_beteta4c24.ui.viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

class FavoriteViewModel():ViewModel {
    private val POKEMON_DATABASE_NAME = "pokemon_database"

    val myPokemonList(context:Context){
        fun getMyPokemons(context:Context){
            CoroutineScope(Dispatchers.IO).launch{
                val myPokemons = getRoomDataBase(context).getPokemonDao().getAllPokemons()
                myPokemonList.postValue(myPokemons)
            }
        }
    }

    fun deleteAllPokemon(context:Context){
        viewModelScope.launch{
            getRoomDataBase(context).getPokemonDao().deleteTable()
            myPokemonList.postvalue(emptyList())
        }
    }

    private fun getRoomDataBase(context:Context):pokemonDatabase{
        return Room.databaseBuilder(
            context,
            PokemonDatabase::class.java,
            POKEMON_DATABASE_NAME.build()
        )
    }
}