package com.example.pokedex.controller

import android.content.Context
import android.widget.Toast
import com.example.pokedex.model.Pokemon

class BuscaPokemon (lista : List<Pokemon>){

    //Quantidade de Pokémon na lista
    val listaPokemon = lista
    val limite = listaPokemon.size

    //Busca o Pokémon por número dentro da lista. Se encontrar, retorna o Pokémon. Senão, retorna nulo e mostra Toast
    fun buscaNumeroPokemon(numero: Int, contexto: Context): Pokemon? {
        //Numero do Pokémon - 1 = index
        val index = numero - 1

        if (index in 0..limite) {
            return listaPokemon.get(index)
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
            if (nome.trim().toUpperCase() == listaPokemon.get(index).nome.trim()
                    .toUpperCase()
            ) {
                pokemonEscolhido = listaPokemon.get(index)
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