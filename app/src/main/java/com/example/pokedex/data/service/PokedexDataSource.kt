package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.repository.PokedexRepository
import kotlinx.coroutines.delay
import org.koin.core.component.KoinComponent

class PokedexDataSource(private val api: ApiService) : PokedexRepository, KoinComponent {

    override suspend fun getPokemonList(): List<Pokemon> {
        return api.getPokedexService().list()
    }

    suspend fun coroutineTest(): List<Pokemon> {
        delay(2000)
        return listOf(
            Pokemon(1, "Bulbasaur", "Description", "Grama", null),
            Pokemon(2, "Ivysaur", "Description", "Grama", null),
            Pokemon(3, "Venusaur", "Description", "Grama", null)
        )
    }
}