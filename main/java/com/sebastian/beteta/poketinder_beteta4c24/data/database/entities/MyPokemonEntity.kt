package com.sebastian.beteta.poketinder_beteta4c24.data.database.entities

@Entity(tableName = "pokemon_table")
data class MyPokemonEntity(
    @PrimaryKey(autoGenerate=true)
    @ColumInfo(name="id") val id: Int=0,
    @ColumInfo(name="idPokemon") val idPokemon: String,
    @ColumInfo(name="name") val name: String,
    @ColumInfo(name="image") val image: String,
    @ColumInfo(name="isLegendary") val isLegendary: Boolean = false,
    @ColumInfo(name="position") val position: Int=-1,
)