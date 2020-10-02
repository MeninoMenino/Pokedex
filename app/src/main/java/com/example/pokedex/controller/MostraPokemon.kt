package com.example.pokedex.controller

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.example.pokedex.fragment.PokemonDialogFragment
import com.example.pokedex.model.Pokemon

class MostraPokemon{

    fun mostraPokemon(fragmentManager : FragmentManager, pokemon : Pokemon, appContext : Context) {
        PokemonDialogFragment(pokemon, appContext).show(fragmentManager, "")
    }
}