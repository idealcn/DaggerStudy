package com.ideal.daggerstudy.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * author: guo ning
 * date: 2020/5/21 10:45
 * qq: 3060974205
 * desc:
 */
@Entity
class User(@PrimaryKey val id : Int, val name :String, val email :String) {
}