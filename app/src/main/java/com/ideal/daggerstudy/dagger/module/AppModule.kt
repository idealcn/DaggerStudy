package com.ideal.daggerstudy.dagger.module

import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.ideal.daggerstudy.ActivityViewModelFactory
import com.ideal.daggerstudy.DaggerApplication
import com.ideal.daggerstudy.db.AppDb
import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * 提供全局使用的一些单例类
 */
@Module
 class AppModule {






    @Provides
    fun provideDatabase(application: DaggerApplication) : AppDb {
        return Room.databaseBuilder(application.applicationContext, AppDb::class.java, "app.db")
                .build()
    }





}