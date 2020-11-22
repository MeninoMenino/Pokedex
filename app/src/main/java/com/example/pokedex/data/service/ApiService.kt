package com.example.pokedex.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://pokedex-restapi.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getPokemonList() : PokedexService {
        return retrofit.create(PokedexService::class.java)
    }
}