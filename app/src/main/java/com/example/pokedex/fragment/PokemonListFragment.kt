package com.example.fragmentslearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentslearning.adapter.PokemonListAdapter
import com.example.pokedex.R

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonListFragment : Fragment() {

    lateinit var recyclerPokemonList : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_pokemon_list, container, false)

        // 1 - Obter o elemento
        recyclerPokemonList = rootView.findViewById<RecyclerView>(R.id.recyclerPokemonList)

        // 2 - Definir um adapter com os itens de listagem
        recyclerPokemonList.adapter = PokemonListAdapter()

        // 3 - Definir o Layout
        recyclerPokemonList.layoutManager = LinearLayoutManager(rootView.context)

        return rootView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PokemonListFragment.
         */
        @JvmStatic
        //fun newInstance(param1: String, param2: String) =
        fun newInstance() =
            PokemonListFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
            }
    }
}
