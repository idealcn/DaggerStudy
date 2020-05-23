package com.ideal.daggerstudy

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
class ActivityViewModelFactory @Inject constructor(
   private val creators : Map<Class<out ViewModel>,@JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val provider = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw Exception("")
        return provider.get() as T
    }
}