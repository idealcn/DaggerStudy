package com.ideal.daggerstudy.repo

import com.ideal.daggerstudy.repo.UserLocalDataSource
import com.ideal.daggerstudy.repo.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * author : guoning
 * date: 2020/5/11 18:25
 * email: gn18667130631@gmail.com
 * desc:
 */
@Singleton
class UserRepository  @Inject constructor(private val remoteDataSource: UserRemoteDataSource,
                                          private  val localDataSource: UserLocalDataSource
) {
    fun getUser() {
        remoteDataSource.getUser()
    }
}