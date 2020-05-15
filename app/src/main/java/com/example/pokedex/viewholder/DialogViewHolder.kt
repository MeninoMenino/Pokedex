package com.example.pokedex.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.controller.MudaCor
import com.example.pokedex.model.Pokemon

class DialogViewHolder(itemView : View): RecyclerView.ViewHolder(itemView)  {

    fun bindInfo(pokemon : Pokemon){
        val imagemPokemon = itemView.findViewById<ImageView>(R.id.imagemPokemon)
        val textNumeroPokemon = itemView.findViewById<TextView>(R.id.textNumeroPokemon)
        val textNomePokemon = itemView.findViewById<TextView>(R.id.textNomePokemon)
        val textDescricao = itemView.findViewById<TextView>(R.id.textDescricao)
        val textTipo1 = itemView.findViewById<TextView>(R.id.textTipo1)
        val textTipo2 = itemView.findViewById<TextView>(R.id.textTipo2)

        imagemPokemon.setImageResource(pokemon.imagem)
        textNumeroPokemon.text = pokemon.numero
        textNomePokemon.text = pokemon.nome
        textDescricao.text = pokemon.descricao
        textTipo1.text = pokemon.tipo1
        MudaCor().mudarCorTipo(textTipo1, itemView.context)

        if (textTipo2.text != null) {
            textTipo2.text = pokemon.tipo2
            MudaCor().mudarCorTipo(textTipo1, itemView.context)
        }
    }
}