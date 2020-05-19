package com.example.pokedex.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentManager
import com.example.pokedex.fragment.PokemonListFragment
import com.example.pokedex.R
import com.example.pokedex.controller.BuscaPokemon
import com.example.pokedex.controller.MostraPokemon
import com.example.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    lateinit var mFragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instância da Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        //Instância do Spinner de opções
        val spinnerOpcoes: Spinner = findViewById(R.id.spinnerOpcoes)
        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.opcoesBusca,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOpcoes.adapter = arrayAdapter

        //Instância do fragmento de lista de Pokémon
        val fragmentManager = supportFragmentManager
        mFragmentManager = fragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameLayoutFragment, PokemonListFragment.newInstance(mFragmentManager)).commit()

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
                    BuscaPokemon().buscaNumeroPokemon(pesquisa.toInt(), this)
            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Insira um número", Toast.LENGTH_SHORT).show()
            }
        }
        //Busca por nome
        else {
            pokemon = BuscaPokemon().buscaNomePokemon(pesquisa, this)
        }

        if (pokemon != null) {
            MostraPokemon().mostraPokemon(mFragmentManager, pokemon)
        }
    }
}