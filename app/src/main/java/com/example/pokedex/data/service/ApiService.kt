package com.example.pokedex.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.pokedex.data.service.ListaPokemonService as ListaPokemonService

object ApiService {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://pokedex-restapi.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getListaPokemon() : ListaPokemonService {
        return retrofit.create(ListaPokemonService::class.java)
    }
}