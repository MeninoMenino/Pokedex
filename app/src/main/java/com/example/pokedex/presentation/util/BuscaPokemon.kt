package com.example.pokedex.presentation.util

import android.content.Context
import android.widget.Toast
import com.example.pokedex.data.model.Pokemon

class BuscaPokemon (private val pokemonList : List<Pokemon>){

    //Quantidade de Pokémon na lista
    val limite = pokemonList.size

    //Busca o Pokémon por número dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun buscaNumeroPokemon(numero: Int, context: Context): Pokemon? {
        //Numero do Pokémon - 1 = index
        val index = numero - 1

        if (index in 0..limite) {
            return pokemonList.get(index)
        } else {
            Toast.makeText(context, "Número inválido", Toast.LENGTH_SHORT).show()
            return null
        }
    }

    //Busca o Pokémon por nome dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun buscaNomePokemon(nome: String, context: Context): Pokemon? {
        var index = 0
        lateinit var pokemonEscolhido: Pokemon
        while (index < limite) {
            if (nome.trim().toUpperCase() == pokemonList.get(index).nome.trim()
                    .toUpperCase()
            ) {
                pokemonEscolhido = pokemonList.get(index)
                break
            } else {
                index++
            }
        }

        if (index >= limite) {
            Toast.makeText(context, "Pokémon não encontrado", Toast.LENGTH_SHORT).show()
            return null
        } else {
            return pokemonEscolhido
        }
    }
}