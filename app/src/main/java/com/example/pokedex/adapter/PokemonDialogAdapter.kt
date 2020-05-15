package com.example.pokedex.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.model.Pokemon
import com.example.pokedex.viewholder.DialogViewHolder

class PokemonDialogAdapter(pokemon: Pokemon) : RecyclerView.Adapter<DialogViewHolder>() {

    var pokemonSelecionado = pokemon

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DialogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_dialog_fragment, parent, false)
        return DialogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DialogViewHolder, position: Int) {
        holder.bindInfo(pokemonSelecionado)
    }

    override fun getItemCount(): Int {
        return 1
    }
}