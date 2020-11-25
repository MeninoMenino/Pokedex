package com.example.pokedex.di

import com.example.pokedex.data.repository.PokedexRepository
import com.example.pokedex.data.service.ApiService
import com.example.pokedex.data.service.PokedexDataSource
import com.example.pokedex.presentation.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single { ApiService() }
}

val viewModelModule = module {
    viewModel { PokemonViewModel() }
}

val repositoryModule = module {
    single<PokedexRepository> { PokedexDataSource(api = get()) }
}

val dataSourceModule = module {
    single { PokedexDataSource(api = get()) }
}