package com.ideal.daggerstudy.module

import com.ideal.daggerstudy.http.HttpRequestService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * author : guoning
 * date: 2020/5/12 10:55
 * email: gn18667130631@gmail.com
 * desc:
 */
@Module
class NetworkModule {
    @Provides
    fun provideHttpRequestService() : HttpRequestService {
        return Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HttpRequestService::class.java)
    }
}