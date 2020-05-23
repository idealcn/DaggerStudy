package com.ideal.daggerstudy.dagger.component

import com.ideal.daggerstudy.activity.UserListActivity
import com.ideal.daggerstudy.dagger.module.UserListModule
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [UserListModule::class])
interface UserListComponent : AndroidInjector<UserListActivity>{

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<UserListActivity>

}