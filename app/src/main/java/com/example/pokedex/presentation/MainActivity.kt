package com.example.pokedex.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.presentation.util.SearchPokemon
import com.example.pokedex.presentation.util.ShowPokemon
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.presentation.adapter.PokemonListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mFragmentManager: FragmentManager
    lateinit var pokemonList: List<Pokemon>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toolbar
        setSupportActionBar(mainToolbar)

        //ViewModel
        val viewModel : PokemonViewModel = ViewModelProviders.of(this).get(PokemonViewModel::class.java)

        viewModel.pokemonLiveData.observe(this, Observer {
            it?.let {pokemonList ->
                with(recyclerPokemonList){
                    mFragmentManager = supportFragmentManager

                    layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
                    setHasFixedSize(true)
                    adapter = PokemonListAdapter(pokemonList, mFragmentManager)
                }
            }
        })
        viewModel.getPokemon()


        //Instância do Spinner de opções
        val optionsSpinner: Spinner = findViewById(R.id.spinnerOptions)
        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.searchOptions,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        optionsSpinner.adapter = arrayAdapter

        //Seta todos os listeners da activity
        setListeners()
    }

    //Função que seta os listeners de todos os botões
    fun setListeners() {
        buttonSearch.setOnClickListener(this)
    }

    //Listener
    override fun onClick(view: View) {
        callSearchPokemon(spinnerOptions.selectedItem.toString(), editTextSearch.text.toString())
    }

    //Função que solicita uma busca de Pokémon. Se receber um retorno não nulo, chama mostrarPokemon()
    fun callSearchPokemon(option : String, search : String) {
        var pokemon: Pokemon? = null

        //Busca por número. Caso insira um texto, mostra toast com exceção
        if (option == "Número") {
            try {
                pokemon =
                    SearchPokemon(pokemonList).searchPokemonNumber(search.toInt(), this)
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Insira um número", Toast.LENGTH_SHORT).show()
            }
        }
        //Busca por nome
        else {
            pokemon = SearchPokemon(pokemonList).searchPokemonName(search, this)
        }

        if (pokemon != null) {
            ShowPokemon().showPokemon(mFragmentManager, pokemon)
        }
    }
}