package com.ideal.daggerstudy.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.ideal.daggerstudy.data.User

@Dao
interface UserDao {

    @Query("select * from USER")
    fun queryUserList() : LiveData<List<User>>
}