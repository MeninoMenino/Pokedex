package com.example.pokedex.service

import com.example.pokedex.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface ListaPokemonService {

    @GET("pokemon")
    fun listar() : Call<List<Pokemon>>

}