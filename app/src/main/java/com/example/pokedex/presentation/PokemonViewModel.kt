package com.example.pokedex.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.service.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel(private val apiService: ApiService) : ViewModel() {

    val pokemonLiveData: MutableLiveData<List<Pokemon>> = MutableLiveData()

    fun getPokemonCoroutines() {
        viewModelScope.launch(Dispatchers.IO) {
            val pokemonList = apiService.getPokemonList()
            withContext(Dispatchers.Main) {
                pokemonLiveData.value = pokemonList
            }
        }
    }
}