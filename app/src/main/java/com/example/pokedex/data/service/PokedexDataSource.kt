package com.example.pokedex.data.service

import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.repository.PokedexRepository
import kotlinx.coroutines.delay
import org.koin.core.component.KoinComponent

class PokedexDataSource(private val api: ApiService) : PokedexRepository, KoinComponent {

    override suspend fun getPokemonList(): List<Pokemon> {
        return api.getPokedexService().list()
    }
}