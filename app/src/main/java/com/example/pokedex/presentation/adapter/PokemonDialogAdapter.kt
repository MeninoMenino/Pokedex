package com.example.pokedex.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.controller.MudaCor
import com.example.pokedex.data.model.Pokemon
import kotlinx.android.synthetic.main.row_dialog_fragment.view.*

class PokemonDialogAdapter(private val pokemon: Pokemon) : RecyclerView.Adapter<PokemonDialogAdapter.PokemonDialogViewHolder>() {

    lateinit var context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonDialogViewHolder {
        context = parent.context

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_dialog_fragment, parent, false)
        return PokemonDialogViewHolder(itemView, context)
    }

    override fun onBindViewHolder(holder: PokemonDialogViewHolder, position: Int) {
        holder.bindView(pokemon)
    }

    override fun getItemCount(): Int = 1

    class PokemonDialogViewHolder(private val view : View,
                                  private val context : Context) : RecyclerView.ViewHolder(view){
        fun bindView(pokemon : Pokemon){
            val imagemPokemon = view.imagemPokemon
            val textNumeroPokemon = view.textNumeroPokemon
            val textNomePokemon = view.textNomePokemon
            val textDescricao = view.textDescricao
            val textTipo1 = view.textTipo1
            val textTipo2 = view.textTipo2
            val uriImagem = "p${pokemon.numero}"

            imagemPokemon.setImageResource(caminhoImagem(context, uriImagem))
            textNumeroPokemon.text = pokemon.numero.toString()
            textNomePokemon.text = pokemon.nome
            textDescricao.text = pokemon.descricao
            textTipo1.text = pokemon.tipo1
            MudaCor().mudarCorTipo(textTipo1, context)

            if (textTipo2.text != null) {
                textTipo2.text = pokemon.tipo2
                MudaCor().mudarCorTipo(textTipo2, view.context)
            }
        }

        //Retorna um caminho a partir de uma String
        fun caminhoImagem(context: Context, nomeImagem: String): Int {
            return context.resources
                .getIdentifier("drawable/$nomeImagem", null, context.packageName)
        }
    }
}