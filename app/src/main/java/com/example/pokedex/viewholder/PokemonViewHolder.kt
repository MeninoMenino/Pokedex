package com.example.pokedex.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.model.Pokemon

class PokemonViewHolder (itemView : View): RecyclerView.ViewHolder(itemView) {

    fun bindInfo(pokemon : Pokemon){
        val nome = itemView.findViewById<TextView>(R.id.textNome)
        nome.text = pokemon.nome
    }

}