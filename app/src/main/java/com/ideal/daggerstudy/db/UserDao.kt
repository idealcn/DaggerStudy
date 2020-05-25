package com.ideal.daggerstudy.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ideal.daggerstudy.data.User

@Dao
interface UserDao {

    @Query("select * from USER")
    fun queryUserList() : LiveData<List<User>>

    /**
     * 插入一个用户,并返回这个用户在数据库中的{@link #PrimaryKey} 字段
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun insertUser(user: User) : Long
}