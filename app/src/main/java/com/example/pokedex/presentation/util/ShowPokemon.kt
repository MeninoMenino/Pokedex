package com.example.pokedex.presentation.util

import androidx.fragment.app.FragmentManager
import com.example.pokedex.presentation.fragment.PokemonDialogFragment
import com.example.pokedex.data.model.Pokemon

class ShowPokemon{

    fun showPokemon(fragmentManager : FragmentManager, pokemon : Pokemon) {
        PokemonDialogFragment(pokemon).show(fragmentManager, "")
    }
}