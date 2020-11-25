package com.example.pokedex.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppDI : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AppDI)

            modules(
                listOf(
                    mainModule,
                    viewModelModule,
                    repositoryModule,
                    dataSourceModule
                )
            )
        }
    }

}