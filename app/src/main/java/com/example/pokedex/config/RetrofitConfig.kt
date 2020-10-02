package com.example.pokedex.config

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.example.pokedex.service.ListaPokemonService as ListaPokemonService

class RetrofitConfig {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://pokedex-restapi.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getListaPokemonService() : ListaPokemonService {
        return retrofit.create(ListaPokemonService::class.java)
    }
}