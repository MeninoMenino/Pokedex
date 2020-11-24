package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
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

    suspend fun getPokemonList(): List<Pokemon> = getPokedexService().list()
}