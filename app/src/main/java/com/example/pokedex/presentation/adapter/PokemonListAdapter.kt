package com.example.pokedex.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.util.ShowPokemon
import com.example.pokedex.data.model.Pokemon
import kotlinx.android.synthetic.main.row_pokemon_list.view.*

class PokemonListAdapter (
    internal val pokemonList: List<Pokemon>,
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
        holder.bindView(pokemonList[position])
    }

    //Retorna quantos itens tem na lista
    override fun getItemCount(): Int = pokemonList.count()

    class PokemonListViewHolder(itemView : View,
                                private val context: Context,
                                private val fragmentManager: FragmentManager) : RecyclerView.ViewHolder(itemView),
                                                    View.OnClickListener{

        val image = itemView.pokemonImage
        val number = itemView.textNumber
        val name = itemView.textName
        lateinit var mPokemon : Pokemon

        fun bindView(pokemon : Pokemon){
            val imagePath = "p${pokemon.number}"
            image.setImageResource(setImagePath(context, imagePath))

            number.text = pokemon.number.toString()
            name.text = pokemon.name

            mPokemon = pokemon

            itemView.setOnClickListener(this)
        }

        //Retorna um caminho a partir de uma String
        fun setImagePath(context: Context, imageName: String): Int {
            return context.resources
                .getIdentifier("drawable/$imageName", null, context.packageName)
        }

        override fun onClick(v: View?) {
            ShowPokemon().showPokemon(fragmentManager, mPokemon)
        }
    }
}