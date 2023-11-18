package com.sebastian.beteta.poketinder_beteta4c24.data.database.dao

import com.sebastian.beteta.poketinder_beteta4c24.data.database.entities.MyPokemonEntity

interface PokemonDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemon: MyPokemonEntity)

    @Query("SELECT * FROM pokemon_table")
    suspend fun getAllPokemons(): List<MyPokemonEntity>

    @Query("DELETE FROM pokemon_table")
    suspend fun deleteTable()
}