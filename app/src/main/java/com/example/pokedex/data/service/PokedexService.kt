package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface PokedexService {

    @GET("pokemon")
    fun list() : Call<List<Pokemon>>

}