package com.example.pokedex.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pokedex.data.model.Pokemon
import com.example.pokedex.data.service.ApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel : ViewModel(){

    val pokemonLiveData : MutableLiveData<List<Pokemon>> = MutableLiveData()

    fun getPokemon(){
        ApiService.getListaPokemon().listar().enqueue(object : Callback<List<Pokemon>>{
            override fun onResponse(call: Call<List<Pokemon>>, response: Response<List<Pokemon>>) {
                pokemonLiveData.value = response.body()
            }

            override fun onFailure(call: Call<List<Pokemon>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}