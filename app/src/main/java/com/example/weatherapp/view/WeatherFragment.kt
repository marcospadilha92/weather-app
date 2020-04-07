package com.example.weatherapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weatherapp.R
import com.example.weatherapp.model.ApiClient
import com.example.weatherapp.viewmodel.WeatherCard

class WeatherFragment: Fragment() {

    val apiClient: ApiClient? = null
    val apiKey = "a48dd7a4e59e69cc6d7ad512436ef6d6"
    val weatherCard: WeatherCard? = null

    companion object {
        const val ARG_NAME = "city"

        fun newInstance(city: String): WeatherFragment {
            val bundle = Bundle().apply {
                putString(ARG_NAME, city)
            }

            return WeatherFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View  = inflater.inflate(R.layout.fragment_weather, container, false)

        val city = arguments?.getString("city")

        if (city != null) {
            apiClient?.getWeather(city, apiKey)
        }

        return view
    }
}