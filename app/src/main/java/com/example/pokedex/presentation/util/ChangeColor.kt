package com.example.pokedex.presentation.util

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.widget.TextView
import com.example.pokedex.R

class ChangeColor() {

    //Muda a cor do texto de acordo com o elemento
    @TargetApi(Build.VERSION_CODES.M) //getColor() precisa da API 21, e a API mínima do app é 15
    fun changeTypeColor(type: TextView, context: Context) {
        when (type.text) {
            "Normal" -> type.setTextColor(context.getColor(R.color.normal))
            "Fogo" -> type.setTextColor(context.getColor(R.color.fogo))
            "Água" -> type.setTextColor(context.getColor(R.color.agua))
            "Grama" -> type.setTextColor(context.getColor(R.color.grama))
            "Elétrico" -> type.setTextColor(context.getColor(R.color.eletrico))
            "Gelo" -> type.setTextColor(context.getColor(R.color.gelo))
            "Venenoso" -> type.setTextColor(context.getColor(R.color.venenoso))
            "Lutador" -> type.setTextColor(context.getColor(R.color.lutador))
            "Terra" -> type.setTextColor(context.getColor(R.color.terra))
            "Voador" -> type.setTextColor(context.getColor(R.color.voador))
            "Psíquico" -> type.setTextColor(context.getColor(R.color.psiquico))
            "Inseto" -> type.setTextColor(context.getColor(R.color.inseto))
            "Pedra" -> type.setTextColor(context.getColor(R.color.pedra))
            "Fantasma" -> type.setTextColor(context.getColor(R.color.fantasma))
            "Sombra" -> type.setTextColor(context.getColor(R.color.sombra))
            "Dragão" -> type.setTextColor(context.getColor(R.color.dragao))
            "Metal" -> type.setTextColor(context.getColor(R.color.metal))
            "Fada" -> type.setTextColor(context.getColor(R.color.fada))
        }
    }

}