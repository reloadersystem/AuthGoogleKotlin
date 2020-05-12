package com.reloader.authgooglekotlin

import android.content.Context
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun getConfiguration(context: Context): Retrofit {

    val url = context.getString(R.string.servidor_ruta)
    val root = url + Constantes.URL_BASE

    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BODY
    val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()

    return Retrofit.Builder()
        .baseUrl("https://classroom.googleapis.com/")
        .baseUrl(root)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}