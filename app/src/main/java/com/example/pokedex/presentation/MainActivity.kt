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
import com.example.pokedex.presentation.util.BuscaPokemon
import com.example.pokedex.presentation.util.MostraPokemon
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.presentation.adapter.PokemonListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mFragmentManager: FragmentManager
    lateinit var listaPokemon: List<Pokemon>

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
        val spinnerOpcoes: Spinner = findViewById(R.id.spinnerOpcoes)
        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.opcoesBusca,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOpcoes.adapter = arrayAdapter

        //Seta todos os listeners da activity
        setListeners()
    }

    //Função que seta os listeners de todos os botões
    fun setListeners() {
        buttonBuscar.setOnClickListener(this)
    }

    //Listener
    override fun onClick(view: View) {
        solicitaPokemon(spinnerOpcoes.selectedItem.toString(), editTextBuscar.text.toString())
    }

    //Função que solicita uma busca de Pokémon. Se receber um retorno não nulo, chama mostrarPokemon()
    fun solicitaPokemon(opcao : String, pesquisa : String) {
        var pokemon: Pokemon? = null

        //Busca por número. Caso insira um texto, mostra toast com exceção
        if (opcao == "Número") {
            try {
                pokemon =
                    BuscaPokemon(listaPokemon).buscaNumeroPokemon(pesquisa.toInt(), this)
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Insira um número", Toast.LENGTH_SHORT).show()
            }
        }
        //Busca por nome
        else {
            pokemon = BuscaPokemon(listaPokemon).buscaNomePokemon(pesquisa, this)
        }

        if (pokemon != null) {
            MostraPokemon().mostraPokemon(mFragmentManager, pokemon)
        }
    }
}