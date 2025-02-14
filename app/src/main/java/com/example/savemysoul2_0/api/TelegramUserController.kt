package com.example.savemysoul2_0.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TelegramUserController {
    private val gson: Gson = GsonBuilder()
        .setLenient()
        .create()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.1.104:8080/TelegramUserController/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun getTelegramUserApi(): TelegramUserApi {
        return retrofit.create(TelegramUserApi::class.java)
    }
}