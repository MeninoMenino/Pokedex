package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET

interface ListaPokemonService {

    @GET("pokemon")
    fun listar() : Call<List<Pokemon>>

}