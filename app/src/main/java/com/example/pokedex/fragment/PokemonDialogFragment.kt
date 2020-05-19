package com.example.pokedex.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.adapter.PokemonDialogAdapter
import com.example.pokedex.model.Pokemon

class PokemonDialogFragment(pokemon: Pokemon) : DialogFragment(){

    val pokemonSelecionado = pokemon
    lateinit var recyclerPokemonList : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_pokemon_dialog, container, false)

        // 1 - Obter o elemento
        recyclerPokemonList = rootView.findViewById<RecyclerView>(R.id.recyclerPokemonList)

        // 2 - Definir um adapter com os itens de listagem
        recyclerPokemonList.adapter = PokemonDialogAdapter(pokemonSelecionado)

        // 3 - Definir o Layout
        recyclerPokemonList.layoutManager = LinearLayoutManager(rootView.context)

        return rootView
    }
}