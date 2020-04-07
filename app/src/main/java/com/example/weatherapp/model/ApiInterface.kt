package com.example.weatherapp.model

import com.example.weatherapp.viewmodel.WeatherCard
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface ApiInterface {

    //http://api.openweathermap.org/data/2.5/weather?q=Curitiba&appid=a48dd7a4e59e69cc6d7ad512436ef6d6
    @GET("/weather?q=")
    @FormUrlEncoded
    fun getWeather(@Field("city") cidade: String, @Field("appid") appId: String): Call<WeatherCard>
}