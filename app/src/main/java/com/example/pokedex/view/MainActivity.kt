package com.example.pokedex.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.example.fragmentslearning.PokemonListFragment
import com.example.pokedex.R
import com.example.pokedex.controller.BuscaPokemon
import com.example.pokedex.controller.MudaCor
import com.example.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val spinnerOpcoes: Spinner = findViewById(R.id.spinnerOpcoes)
        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this,
            R.array.opcoesBusca,
            android.R.layout.simple_spinner_item
        )
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerOpcoes.adapter = arrayAdapter

        setListeners()

        //Começa o app com o primeiro Pokémon da lista
        solicitaPokemon("Número", "1")

        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.frameLayoutFragment, PokemonListFragment.newInstance()).commit()
    }

    //Função que seta os listeners de todos os botões
    fun setListeners() {
        buttonBuscar.setOnClickListener(this)
    }

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
            mostraPokemon(pokemon)
        }
    }

    //Função que mostra o Pokémon solicitado na tela
    fun mostraPokemon(pokemon: Pokemon) {
        imagemPokemon.setImageResource(pokemon.imagem)
        textNumeroPokemon.text = pokemon.numero
        textNomePokemon.text = pokemon.nome
        textDescricao.text = pokemon.descricao
        textTipo1.text = pokemon.tipo1
        MudaCor().mudarCorTipo(textTipo1, this)

        if (textTipo2.text != null) {
            textTipo2.text = pokemon.tipo2
            MudaCor().mudarCorTipo(textTipo2, this)
        }
    }
}