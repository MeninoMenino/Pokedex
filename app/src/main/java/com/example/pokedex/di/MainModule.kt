package com.example.pokedex.di

import com.example.pokedex.data.service.ApiService
import com.example.pokedex.presentation.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module{
    factory { ApiService() }

    viewModel { PokemonViewModel(get()) }
}