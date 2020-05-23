package com.ideal.daggerstudy.model

import android.widget.Toast
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.ideal.daggerstudy.AppExecutors
import com.ideal.daggerstudy.data.User
import com.ideal.daggerstudy.http.HttpRequestService
import com.ideal.daggerstudy.http.Resource
import javax.inject.Inject

/**
 * author: guo ning
 * date: 2020/5/21 10:19
 * qq: 3060974205
 * desc:
 */
class LoginModel @Inject constructor( val httpRequestService: HttpRequestService,
                                          val appExecutors : AppExecutors) :ViewModel() {


    val result = MediatorLiveData<Resource<User>>()
//    @Inject
//    lateinit var appExecutors : AppExecutors

    fun  login(name: String, pwd: String) {
        println("appExecutors => ${appExecutors==null}")

        result.value = Resource.loading(null)
        appExecutors.networkIO().execute(Runnable {
            val apiResponse = httpRequestService.login(name, pwd)

        })


    }

}