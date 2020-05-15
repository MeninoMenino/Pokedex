package com.example.pokedex.controller

import android.content.Context
import android.widget.Toast
import com.example.pokedex.model.Pokemon
import com.example.pokedex.repository.PokemonList

class BuscaPokemon {

    //Quantidade de Pokémon na lista
    val limite = PokemonList().pokemonList.size

    //Busca o Pokémon por número dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun buscaNumeroPokemon(numero: Int, contexto: Context): Pokemon? {
        //Numero do Pokémon - 1 = index
        val index = numero - 1

        if (index in 0..limite) {
            return PokemonList().getPokemon(index)
        } else {
            Toast.makeText(contexto, "Número inválido", Toast.LENGTH_SHORT).show()
            return null
        }
    }

    //Busca o Pokémon por nome dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun buscaNomePokemon(nome: String, contexto: Context): Pokemon? {
        var index = 0
        lateinit var pokemonEscolhido: Pokemon
        while (index < limite) {
            if (nome.trim().toUpperCase() == PokemonList().getPokemon(index).nome.trim()
                    .toUpperCase()
            ) {
                pokemonEscolhido = PokemonList().getPokemon(index)
                break
            } else {
                index++
            }
        }

        if (index >= limite) {
            Toast.makeText(contexto, "Pokémon não encontrado", Toast.LENGTH_SHORT).show()
            return null
        } else {
            return pokemonEscolhido
        }
    }
}