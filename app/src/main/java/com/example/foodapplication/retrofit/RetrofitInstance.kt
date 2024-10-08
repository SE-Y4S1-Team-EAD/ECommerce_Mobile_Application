package com.example.foodapplication.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api:MealApi by lazy {
        Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com/products/")
        .addConverterFactory(GsonConverterFactory.create()).build()
        .create(MealApi::class.java)
    }
}