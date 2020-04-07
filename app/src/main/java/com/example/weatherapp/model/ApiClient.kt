package com.example.weatherapp.model

import com.example.weatherapp.viewmodel.WeatherCard
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    private val BASE_URL = "http://api.openweathermap.org/data/2.5/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiInterface::class.java)

    fun getWeather(cidade: String, apiKey: String) : Call<WeatherCard> { return api.getWeather(cidade, apiKey)}
}