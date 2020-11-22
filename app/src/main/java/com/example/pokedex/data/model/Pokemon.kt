package com.example.pokedex.data.model

data class Pokemon(
    val number: Int,
    val name: String,
    val description: String,
    val type1: String,
    val type2: String?
) {
}