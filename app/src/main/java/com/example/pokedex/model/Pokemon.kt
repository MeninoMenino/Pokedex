package com.example.pokedex.model

class Pokemon(imagem: Int, numero: String, nome: String, descricao: String, tipo1: String, tipo2: String?) {
    val imagem = imagem
    val numero = numero
    val nome = nome
    val descricao = descricao
    val tipo1 = tipo1
    val tipo2 : String? = tipo2
}