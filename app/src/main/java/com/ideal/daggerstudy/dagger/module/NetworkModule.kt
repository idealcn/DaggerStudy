package com.ideal.daggerstudy.dagger.module

import LiveDataCallAdapterFactory
import com.ideal.daggerstudy.AppExecutors
import com.ideal.daggerstudy.http.HttpRequestService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executor
import javax.inject.Singleton

/**
 * author : guoning
 * date: 2020/5/12 10:55
 * email: gn18667130631@gmail.com
 * desc:
 */
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideHttpRequestService() : HttpRequestService {
        return Retrofit.Builder()
            .baseUrl("")
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(HttpRequestService::class.java)
    }

    @Singleton
    @Provides
    fun provideExecutor() : AppExecutors {
       return AppExecutors()
    }

    @Provides
    fun diskIO(appExecutors: AppExecutors) : Executor {
        return  appExecutors.diskIO()
    }
}