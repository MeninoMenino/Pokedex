package com.example.pokedex.presentation.util

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.widget.TextView
import com.example.pokedex.R

class MudaCor() {

    //Muda a cor do texto de acordo com o elemento
    @TargetApi(Build.VERSION_CODES.M) //getColor() precisa da API 21, e a API mínima do app é 15
    fun mudarCorTipo(tipo: TextView, context: Context) {
        when (tipo.text) {
            "Normal" -> tipo.setTextColor(context.getColor(R.color.normal))
            "Fogo" -> tipo.setTextColor(context.getColor(R.color.fogo))
            "Água" -> tipo.setTextColor(context.getColor(R.color.agua))
            "Grama" -> tipo.setTextColor(context.getColor(R.color.grama))
            "Elétrico" -> tipo.setTextColor(context.getColor(R.color.eletrico))
            "Gelo" -> tipo.setTextColor(context.getColor(R.color.gelo))
            "Venenoso" -> tipo.setTextColor(context.getColor(R.color.venenoso))
            "Lutador" -> tipo.setTextColor(context.getColor(R.color.lutador))
            "Terra" -> tipo.setTextColor(context.getColor(R.color.terra))
            "Voador" -> tipo.setTextColor(context.getColor(R.color.voador))
            "Psíquico" -> tipo.setTextColor(context.getColor(R.color.psiquico))
            "Inseto" -> tipo.setTextColor(context.getColor(R.color.inseto))
            "Pedra" -> tipo.setTextColor(context.getColor(R.color.pedra))
            "Fantasma" -> tipo.setTextColor(context.getColor(R.color.fantasma))
            "Sombra" -> tipo.setTextColor(context.getColor(R.color.sombra))
            "Dragão" -> tipo.setTextColor(context.getColor(R.color.dragao))
            "Metal" -> tipo.setTextColor(context.getColor(R.color.metal))
            "Fada" -> tipo.setTextColor(context.getColor(R.color.fada))
        }
    }

}