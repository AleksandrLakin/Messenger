package com.example.mymessage.di

import com.example.mymessage.data.Api
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.log

@Module
object NetworkModule {

    @Provides
    fun provideHttpClient(): OkHttpClient = OkHttpClient
        .Builder()
        .addInterceptor (HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
        .build()

    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("http://109.196.164.62:5000")
        .build()

    @Provides
    fun provideApi(retrofit: Retrofit):Api = retrofit.create(Api::class.java)

}