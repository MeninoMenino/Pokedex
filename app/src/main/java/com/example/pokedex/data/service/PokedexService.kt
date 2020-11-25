package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface PokedexService {

    @GET("pokemonList")
    suspend fun list() : List<Pokemon>

}