package com.ideal.daggerstudy.dagger.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ideal.daggerstudy.ActivityViewModelFactory
import com.ideal.daggerstudy.dagger.di.ViewModelKey
import com.ideal.daggerstudy.model.LoginModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ActivityViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(LoginModel::class)
    abstract fun bindLoginViewModel(viewModel : LoginModel) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory : ActivityViewModelFactory) : ViewModelProvider.Factory
}