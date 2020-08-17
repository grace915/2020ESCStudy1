package com.example.a2020escstudy1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main_btn_sunny.setOnClickListener {
            main_tv_weather.text = "맑은 날"
            main_iv_weather.isVisible = false
            main_iv_sunny.isVisible = true
            main_iv_cloudy.isVisible = true
            main_iv_rainy.isVisible = false
            main_iv_snowy.isVisible = false

        }
        main_btn_cloudy.setOnClickListener {
            main_tv_weather.text = "흐린 날"
            main_iv_weather.isVisible = false
            main_iv_sunny.isVisible = false
            main_iv_cloudy.isVisible = true
            main_iv_rainy.isVisible = false
            main_iv_snowy.isVisible = false
        }
        main_btn_rainy.setOnClickListener {
            main_tv_weather.text = "비 오는 날"
            main_iv_weather.isVisible = false
            main_iv_sunny.isVisible = false
            main_iv_cloudy.isVisible = false
            main_iv_rainy.isVisible = true
            main_iv_snowy.isVisible = false
        }

        main_btn_snowy.setOnClickListener {
            main_tv_weather.text = "눈 오는 날"
            main_iv_weather.isVisible = false
            main_iv_sunny.isVisible = false
            main_iv_cloudy.isVisible = false
            main_iv_rainy.isVisible = false
            main_iv_snowy.isVisible = true
        }





        }
}