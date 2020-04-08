package com.onoffrice.norrisJokes.data.network

import retrofit2.Retrofit

class ServiceGenerator(
    private val retrofit: Retrofit
) {

    fun <T> forClass(serviceClass: Class<T>): T {
        return retrofit.create(serviceClass)
    }
}