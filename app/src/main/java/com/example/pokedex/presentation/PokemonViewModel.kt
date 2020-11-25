package com.example.pokedex.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.repository.PokedexRepository
import com.example.pokedex.data.service.PokedexDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class PokemonViewModel() : ViewModel(), KoinComponent {

    private val pokedexRepository by inject<PokedexDataSource>()
    val pokemonLiveData: MutableLiveData<List<Pokemon>> = MutableLiveData()

    fun getPokemonCoroutines() {
        viewModelScope.launch(context = Dispatchers.IO) {
            val pokemonList = pokedexRepository.getPokemonList()
            withContext(context = Dispatchers.Main) {
                pokemonLiveData.value = pokemonList
            }
        }
    }
}