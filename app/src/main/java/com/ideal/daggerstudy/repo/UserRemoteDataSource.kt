package com.ideal.daggerstudy.repo

import com.ideal.daggerstudy.http.HttpRequestService
import javax.inject.Inject

/**
 * author : guoning
 * date: 2020/5/11 18:25
 * email: gn18667130631@gmail.com
 * desc:
 */
class UserRemoteDataSource @Inject constructor(private val requestService: HttpRequestService){

        fun getUser() {
            requestService.getUser()
        }

}