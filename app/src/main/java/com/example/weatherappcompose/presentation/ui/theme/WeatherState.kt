package com.example.weatherappcompose.presentation.ui.theme

import com.example.weatherappcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null ,
    val isLoading: Boolean = false,
    val error: String? = null
)
