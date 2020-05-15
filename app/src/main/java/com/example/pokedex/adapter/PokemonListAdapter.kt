package com.example.pokedex.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.repository.PokemonList
import com.example.pokedex.viewholder.PokemonViewHolder

class PokemonListAdapter () : RecyclerView.Adapter<PokemonViewHolder>() {

    //Cria a linha
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_pokemon_list, parent, false)
        return PokemonViewHolder(view)
    }

    //Atribui os valores na linha criada
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bindInfo(PokemonList().getPokemon(position))
    }

    //Retorna quantos itens tem na lista
    override fun getItemCount(): Int {
        return PokemonList().pokemonList.size
    }
}