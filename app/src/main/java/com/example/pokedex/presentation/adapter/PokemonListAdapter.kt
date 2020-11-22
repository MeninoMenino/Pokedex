package com.example.pokedex.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.util.MostraPokemon
import com.example.pokedex.data.model.Pokemon
import kotlinx.android.synthetic.main.row_pokemon_list.view.*

class PokemonListAdapter (private val listaPokemon : List<Pokemon>,
                          private val fragmentManager: FragmentManager) : RecyclerView.Adapter<PokemonListAdapter.PokemonListViewHolder>() {

    lateinit var context: Context

    //Cria a linha
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder {
        context = parent.context

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_pokemon_list, parent, false)
        return PokemonListViewHolder(itemView, context, fragmentManager)
    }

    //Atribui os valores na linha criada
    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        holder.bindView(listaPokemon[position])
    }

    //Retorna quantos itens tem na lista
    override fun getItemCount(): Int = listaPokemon.count()

    class PokemonListViewHolder(itemView : View,
                                private val context: Context,
                                private val fragmentManager: FragmentManager) : RecyclerView.ViewHolder(itemView),
                                                    View.OnClickListener{

        val imagem = itemView.imagemPokemon
        val numero = itemView.textNumero
        val nome = itemView.textNome
        lateinit var mPokemon : Pokemon

        fun bindView(pokemon : Pokemon){
            val uriImagem = "p${pokemon.numero}"
            imagem.setImageResource(caminhoImagem(context, uriImagem))

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
            MostraPokemon().mostraPokemon(fragmentManager, mPokemon)
        }
    }
}