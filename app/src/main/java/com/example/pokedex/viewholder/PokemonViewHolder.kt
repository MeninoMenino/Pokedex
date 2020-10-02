package com.example.pokedex.viewholder

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.controller.MostraPokemon
import com.example.pokedex.model.Pokemon

class PokemonViewHolder(itemView: View, fragmentManager: FragmentManager, appContext : Context) : RecyclerView.ViewHolder(
    itemView
), View.OnClickListener {

    lateinit var mPokemon: Pokemon
    val mFragmentManager = fragmentManager
    val appContext = appContext

    fun bindInfo(pokemon: Pokemon) {

        val imagem = itemView.findViewById<ImageView>(R.id.imagemPokemon)
        val numero = itemView.findViewById<TextView>(R.id.textNumero)
        val nome = itemView.findViewById<TextView>(R.id.textNome)
        var uriImagem = "p${pokemon.numero}"
        imagem.setImageResource(caminhoImagem(appContext, uriImagem))
        numero.text = pokemon.numero.toString()
        nome.text = pokemon.nome

        mPokemon = pokemon

        itemView.setOnClickListener(this)
    }

    //Retorna um caminho a partir de uma String
    fun caminhoImagem(context: Context, nomeImagem: String): Int {
        return context.resources
            .getIdentifier("drawable/$nomeImagem", null, context.packageName)
    }

    override fun onClick(v: View?) {
        MostraPokemon().mostraPokemon(mFragmentManager, mPokemon, appContext)
    }
}