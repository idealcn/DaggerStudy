package com.ideal.daggerstudy.dagger.di

import androidx.lifecycle.ViewModel
import dagger.MapKey
import java.lang.annotation.RetentionPolicy
import kotlin.reflect.KClass

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER)
@MapKey
annotation class ViewModelKey (val clazz : KClass<out ViewModel>)