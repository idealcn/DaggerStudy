package com.ideal.daggerstudy.dagger.component

import com.ideal.daggerstudy.DaggerApplication
import com.ideal.daggerstudy.dagger.module.ActivityModule
import com.ideal.daggerstudy.dagger.module.AppModule
import com.ideal.daggerstudy.dagger.module.FragmentModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * author : guoning
 * date: 2020/5/12 10:40
 * email: gn18667130631@gmail.com
 * desc:
 */
@Singleton
@Component(modules = [AndroidInjectionModule::class,/*框架提供的必填*/
    AndroidSupportInjectionModule::class,/*框架提供的必填*/
    ActivityModule::class,
    FragmentModule::class,
AppModule::class
   ])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        fun build() : ApplicationComponent
        @BindsInstance
        fun application( application: DaggerApplication) : Builder
    }

    fun inject(application: DaggerApplication)

}