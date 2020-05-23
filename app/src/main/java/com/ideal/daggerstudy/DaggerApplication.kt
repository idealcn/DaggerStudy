package com.ideal.daggerstudy

import android.app.Activity
import android.app.Application
import com.ideal.daggerstudy.dagger.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

/**
 * author : guoning
 * date: 2020/5/11 18:42
 * email: gn18667130631@gmail.com
 * desc:
 */
class DaggerApplication : Application() ,HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

       DaggerApplicationComponent.builder().application(this)
           .build().inject(this)
    }


    override fun androidInjector(): AndroidInjector<Any> = androidInjector


}