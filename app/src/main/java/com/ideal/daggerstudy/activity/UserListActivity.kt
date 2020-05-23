package com.ideal.daggerstudy.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ideal.daggerstudy.R
import com.ideal.daggerstudy.db.UserDao
import dagger.android.AndroidInjection
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserListActivity : AppCompatActivity() {

    @Inject
    lateinit var userDao: UserDao

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)

        CoroutineScope(Dispatchers.IO).launch {
            userDao.queryUserList()
        }
    }


}