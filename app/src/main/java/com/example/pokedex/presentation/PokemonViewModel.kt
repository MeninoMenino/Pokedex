package com.example.pokedex.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokedex.data.model.Pokemon

class PokemonViewModel : ViewModel(){

    val pokemonLiveData : MutableLiveData<Pokemon> = MutableLiveData()

    fun getPokemon(){
        //TODO: Implementar a busca dos Pokémon na API
    }

}