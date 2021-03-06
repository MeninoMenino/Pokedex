package com.example.pokedex.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.adapter.PokemonDialogAdapter
import com.example.pokedex.data.model.Pokemon

class PokemonDialogFragment(pokemon: Pokemon) : DialogFragment(){

    val selectedPokemon = pokemon
    lateinit var recyclerPokemonList : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_pokemon_dialog, container, false)

        // 1 - Obter o elemento
        recyclerPokemonList = rootView.findViewById(R.id.recyclerPokemonList)

        // 2 - Definir um adapter com os itens de listagem
        recyclerPokemonList.adapter = PokemonDialogAdapter(selectedPokemon)

        // 3 - Definir o Layout
        recyclerPokemonList.layoutManager = LinearLayoutManager(rootView.context)

        return rootView
    }
}