package com.example.pokedex.controller

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedex.R
import com.example.pokedex.model.Pokemon
import kotlinx.android.synthetic.main.activity_main.*

class MudaCor {

    constructor() {}

    //Muda a cor do texto de acordo com o elemento
    @TargetApi(Build.VERSION_CODES.M) //getColor() precisa da API 21, e a API mínima do app é 15
    fun mudarCorTipo(tipo: TextView, contexto: Context) {
        when (tipo.text) {
            "Normal" -> tipo.setTextColor(contexto.getColor(R.color.normal))
            "Fogo" -> tipo.setTextColor(contexto.getColor(R.color.fogo))
            "Água" -> tipo.setTextColor(contexto.getColor(R.color.agua))
            "Grama" -> tipo.setTextColor(contexto.getColor(R.color.grama))
            "Elétrico" -> tipo.setTextColor(contexto.getColor(R.color.eletrico))
            "Gelo" -> tipo.setTextColor(contexto.getColor(R.color.gelo))
            "Venenoso" -> tipo.setTextColor(contexto.getColor(R.color.venenoso))
            "Lutador" -> tipo.setTextColor(contexto.getColor(R.color.lutador))
            "Terra" -> tipo.setTextColor(contexto.getColor(R.color.terra))
            "Voador" -> tipo.setTextColor(contexto.getColor(R.color.voador))
            "Psíquico" -> tipo.setTextColor(contexto.getColor(R.color.psiquico))
            "Inseto" -> tipo.setTextColor(contexto.getColor(R.color.inseto))
            "Pedra" -> tipo.setTextColor(contexto.getColor(R.color.pedra))
            "Fantasma" -> tipo.setTextColor(contexto.getColor(R.color.fantasma))
            "Sombra" -> tipo.setTextColor(contexto.getColor(R.color.sombra))
            "Dragão" -> tipo.setTextColor(contexto.getColor(R.color.dragao))
            "Metal" -> tipo.setTextColor(contexto.getColor(R.color.metal))
            "Fada" -> tipo.setTextColor(contexto.getColor(R.color.fada))
        }
    }

}