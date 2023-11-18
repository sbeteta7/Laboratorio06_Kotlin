package com.sebastian.beteta.poketinder_beteta4c24.data.model

import com.google.gson.annotations.SerializedName

data class PokemonListResponse (
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: List<PokemonResponse>
    )