package com.example.weatherappcompose.data.remote

import com.squareup.moshi.Json

data class WeatherDet(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDet
)
