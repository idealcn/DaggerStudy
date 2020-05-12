package com.ideal.daggerstudy.http

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * author : guoning
 * date: 2020/5/12 6:59
 * email: gn18667130631@gmail.com
 * desc:
 */
interface HttpRequestService {

    @POST("")
    fun getUser() : String

    @FormUrlEncoded
    @POST("")
    fun login(@Field("username") username: String,@Field("password") password: String)
}