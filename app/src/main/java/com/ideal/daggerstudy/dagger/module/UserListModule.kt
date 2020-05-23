package com.ideal.daggerstudy.dagger.module

import com.ideal.daggerstudy.db.AppDb
import com.ideal.daggerstudy.db.UserDao
import dagger.Module
import dagger.Provides

@Module
class UserListModule {

    @Provides
    fun provideUserDao(db: AppDb) : UserDao{
        return db.userDao()
    }

}