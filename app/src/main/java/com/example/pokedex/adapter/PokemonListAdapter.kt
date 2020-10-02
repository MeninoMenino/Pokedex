package com.example.pokedex.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.model.Pokemon
import com.example.pokedex.viewholder.PokemonViewHolder

class PokemonListAdapter (fragmentManager : FragmentManager, listaPokemon : List<Pokemon>, appContext: Context) : RecyclerView.Adapter<PokemonViewHolder>() {

    val mFragmentManager = fragmentManager
    val mListaPokemon = listaPokemon
    val appContext = appContext

    //Cria a linha
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.row_pokemon_list, parent, false)
        return PokemonViewHolder(view, mFragmentManager, appContext)
    }

    //Atribui os valores na linha criada
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bindInfo(mListaPokemon.get(position))
    }

    //Retorna quantos itens tem na lista
    override fun getItemCount(): Int {
        return mListaPokemon.size
    }
}