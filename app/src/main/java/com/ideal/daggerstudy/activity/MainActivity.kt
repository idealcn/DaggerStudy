package com.ideal.daggerstudy.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ideal.daggerstudy.R

class MainActivity : AppCompatActivity() {

//    @Inject lateinit var userRepository : UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        userRepository.getUser()
    }
}
