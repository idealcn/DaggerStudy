package com.ideal.daggerstudy.dagger.module

import com.ideal.daggerstudy.activity.LoginActivity
import com.ideal.daggerstudy.dagger.component.LoginComponent
import com.ideal.daggerstudy.activity.UserListActivity
import com.ideal.daggerstudy.dagger.component.UserListComponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

/**
 * 用于存放Activity的SubComponent
 */
@Module(subcomponents = [LoginComponent::class, UserListComponent::class],
    includes = [NetworkModule::class, ActivityViewModelModule::class])
abstract class ActivityModule {

//    @ContributesAndroidInjector
//    abstract fun contributeLoginActivity() : LoginActivity






    @Binds
    @IntoMap
    @ClassKey(LoginActivity::class)
    abstract fun bindAndroidLoginInjectorFactory(factory : LoginComponent.Factory) : AndroidInjector.Factory<*>


    @Binds
    @IntoMap
    @ClassKey(UserListActivity::class)
    abstract fun bindAndroidUserListInjectorFactory(factory: UserListComponent.Factory) : AndroidInjector.Factory<*>
}