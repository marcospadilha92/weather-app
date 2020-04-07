package com.example.weatherapp.view

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.weatherapp.R

class MainActivity: AppCompatActivity() {

    private val fragment: WeatherFragment = WeatherFragment.newInstance("Cidade")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft :FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.hide(fragment);

        val edit = findViewById<EditText>(R.id.city_editText)

        val button = findViewById<Button>(R.id.search_button)
        button.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(
                    R.id.container,
                    WeatherFragment.newInstance(edit.text.toString()), "Weather Fragment")

                .commit()
        }
    }
}