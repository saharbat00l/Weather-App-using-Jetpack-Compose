package com.example.weatherappcompose.domain.repository

import com.example.weatherappcompose.domain.util.Resource
import com.example.weatherappcompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}