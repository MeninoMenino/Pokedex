package com.example.pokedex.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.controller.MostraPokemon
import com.example.pokedex.model.Pokemon

class PokemonViewHolder(itemView: View, fragmentManager: FragmentManager) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    lateinit var mPokemon: Pokemon
    val mFragmentManager = fragmentManager

    fun bindInfo(pokemon: Pokemon) {

        val imagem = itemView.findViewById<ImageView>(R.id.imagemPokemon)
        val numero = itemView.findViewById<TextView>(R.id.textNumero)
        val nome = itemView.findViewById<TextView>(R.id.textNome)
        imagem.setImageResource(pokemon.imagem)
        numero.text = pokemon.numero
        nome.text = pokemon.nome

        mPokemon = pokemon

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        MostraPokemon().mostraPokemon(mFragmentManager, mPokemon)
    }
}