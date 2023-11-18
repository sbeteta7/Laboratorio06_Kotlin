package com.sebastian.beteta.poketinder_beteta4c24.data.network

import com.sebastian.beteta.poketinder_beteta4c24.data.model.PokemonListResponse
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApi {
    @GET("?limit=20")
    suspend fun getPokemons() : Response<PokemonListResponse>
}