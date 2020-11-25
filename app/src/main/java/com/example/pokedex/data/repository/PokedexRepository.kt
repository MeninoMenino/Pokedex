package com.example.pokedex.data.repository

import com.example.pokedex.data.model.Pokemon

interface PokedexRepository {

    suspend fun getPokemonList() : List<Pokemon>
}