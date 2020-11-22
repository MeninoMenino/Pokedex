package com.example.pokedex.presentation.util

import android.content.Context
import android.widget.Toast
import com.example.pokedex.data.model.Pokemon

class SearchPokemon (private val pokemonList : List<Pokemon>){

    //Quantidade de Pokémon na lista
    val limit = pokemonList.size

    //Busca o Pokémon por número dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun searchPokemonNumber(number: Int, context: Context): Pokemon? {
        //Numero do Pokémon - 1 = index
        val index = number - 1

        if (index in 0..limit) {
            return pokemonList.get(index)
        } else {
            Toast.makeText(context, "Número inválido", Toast.LENGTH_SHORT).show()
            return null
        }
    }

    //Busca o Pokémon por nome dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun searchPokemonName(name: String, context: Context): Pokemon? {
        var index = 0
        lateinit var selectedPokemon: Pokemon
        while (index < limit) {
            if (name.trim().toUpperCase() == pokemonList.get(index).name.trim()
                    .toUpperCase()
            ) {
                selectedPokemon = pokemonList.get(index)
                break
            } else {
                index++
            }
        }

        if (index >= limit) {
            Toast.makeText(context, "Pokémon não encontrado", Toast.LENGTH_SHORT).show()
            return null
        } else {
            return selectedPokemon
        }
    }
}