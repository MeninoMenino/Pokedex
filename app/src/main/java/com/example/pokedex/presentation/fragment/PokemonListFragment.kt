package com.example.pokedex.presentation.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.adapter.PokemonListAdapter
import com.example.pokedex.data.model.Pokemon

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonListFragment(fragmentManager: FragmentManager, listaPokemon : List<Pokemon>, appContext: Context) : Fragment() {

    val mFragmentManager = fragmentManager
    lateinit var recyclerPokemonList : RecyclerView
    val mListaPokemon = listaPokemon

    val appContext = appContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_pokemon_list, container, false)

        // 1 - Obter o elemento
        recyclerPokemonList = rootView.findViewById<RecyclerView>(R.id.recyclerPokemonList)

        // 2 - Definir um adapter com os itens de listagem
        recyclerPokemonList.adapter = PokemonListAdapter(mListaPokemon, mFragmentManager)

        // 3 - Definir o Layout
        recyclerPokemonList.layoutManager = LinearLayoutManager(rootView.context)

        recyclerPokemonList.setRecyclerListener {  }

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(fragmentManager: FragmentManager, listaPokemon: List<Pokemon>, appContext: Context) =
            PokemonListFragment(fragmentManager, listaPokemon, appContext).apply {
            }
    }
}