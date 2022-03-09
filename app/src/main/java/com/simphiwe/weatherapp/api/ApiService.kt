package com.simphiwe.weatherapp.api

import com.simphiwe.weatherapp.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Johannesburg")
    suspend fun getWeather(): Response<Weather>
}