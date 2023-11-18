package com.sebastian.beteta.poketinder_beteta4c24.data.database

import com.sebastian.beteta.poketinder_beteta4c24.data.database.dao.PokemonDao
import com.sebastian.beteta.poketinder_beteta4c24.data.database.entities.MyPokemonEntity

@DataBase(entities =[MyPokemonEntity::class],version=1)
abstract class PokemonDatabase: RoomDatabase(){
    abstract fun getPokemonDao(): PokemonDao
}