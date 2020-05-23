package com.ideal.daggerstudy.dagger.component

import com.ideal.daggerstudy.activity.LoginActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * author : guoning
 * date: 2020/5/12 10:41
 * email: gn18667130631@gmail.com
 * desc:
 */
@Subcomponent
interface LoginComponent : AndroidInjector<LoginActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<LoginActivity>{
    }



}