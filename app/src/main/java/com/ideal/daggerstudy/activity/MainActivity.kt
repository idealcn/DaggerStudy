package com.ideal.daggerstudy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.ideal.daggerstudy.R
import com.ideal.daggerstudy.data.User
import com.ideal.daggerstudy.db.AppDb
import com.ideal.daggerstudy.db.UserDao
import com.ideal.daggerstudy.tools.launchIO
import dagger.android.AndroidInjection
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

//    @Inject lateinit var userRepository : UserRepository

    @Inject
    lateinit var userDao: UserDao


    override fun onCreate(savedInstanceState: Bundle?) {
       AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        launchIO {
            val user = User(Random(1000).nextInt(),"ideal","126@126.com")
            val insertUser = userDao.insertUser(user)
            println("insertUser =》 $insertUser")
        }


//        userRepository.getUser()
    }
}
