package com.ideal.daggerstudy.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ideal.daggerstudy.data.User

@Database(entities = [User::class],version = 1,exportSchema = true)
abstract class AppDb : RoomDatabase(){
    abstract fun userDao() : UserDao
}