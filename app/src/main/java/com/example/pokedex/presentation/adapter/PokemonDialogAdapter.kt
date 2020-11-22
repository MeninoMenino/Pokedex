package com.example.pokedex.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.util.ChangeColor
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
            val pokemonImage = view.pokemonImage
            val textPokemonNumber = view.textPokemonNumber
            val textPokemonName = view.textPokemonName
            val textDescription = view.textDescription
            val textType1 = view.textType1
            val textType2 = view.textType2
            val imagePath = "p${pokemon.number}"

            pokemonImage.setImageResource(setImagePath(context, imagePath))
            textPokemonNumber.text = pokemon.number.toString()
            textPokemonName.text = pokemon.name
            textDescription.text = pokemon.description
            textType1.text = pokemon.type1
            ChangeColor().changeTypeColor(textType1, context)

            if (textType2.text != null) {
                textType2.text = pokemon.type2
                ChangeColor().changeTypeColor(textType2, view.context)
            }
        }

        //Retorna um caminho a partir de uma String
        fun setImagePath(context: Context, imageName: String): Int {
            return context.resources
                .getIdentifier("drawable/$imageName", null, context.packageName)
        }
    }
}