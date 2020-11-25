package com.example.pokedex.data.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://pokedex-restapi.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getPokedexService(): PokedexService {
        return retrofit.create(PokedexService::class.java)
    }
}