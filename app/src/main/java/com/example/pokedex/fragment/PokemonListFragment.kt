package com.example.pokedex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.adapter.PokemonListAdapter

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonListFragment(fragmentManager: FragmentManager) : Fragment() {

    val mFragmentManager = fragmentManager
    lateinit var recyclerPokemonList : RecyclerView

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
        recyclerPokemonList.adapter = PokemonListAdapter(mFragmentManager)

        // 3 - Definir o Layout
        recyclerPokemonList.layoutManager = LinearLayoutManager(rootView.context)

        recyclerPokemonList.setRecyclerListener {  }

        return rootView
    }

    companion object {
        @JvmStatic
        fun newInstance(fragmentManager: FragmentManager) =
            PokemonListFragment(fragmentManager).apply {
            }
    }
}