package com.example.weatherapp.view

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.weatherapp.R

class MainActivity: AppCompatActivity() {

    private val fragment: WeatherFragment = WeatherFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft :FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.hide(fragment);

        val button = findViewById<Button>(R.id.search_button)
        button.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(
                    R.id.container,
                    WeatherFragment.newInstance(), "Weather Fragment")

                .commit()
        }
    }
}