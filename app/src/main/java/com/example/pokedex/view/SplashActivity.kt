package com.example.pokedex.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pokedex.R
import com.example.pokedex.repository.PokemonList
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        buttonIniciar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
