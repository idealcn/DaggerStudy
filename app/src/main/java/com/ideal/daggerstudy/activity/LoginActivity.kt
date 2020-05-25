package com.ideal.daggerstudy.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ideal.daggerstudy.R
import com.ideal.daggerstudy.model.LoginModel
import dagger.android.AndroidInjection
import javax.inject.Inject

/**
 * author : guoning
 * date: 2020/5/12 7:43
 * email: gn18667130631@gmail.com
 * desc:
 */
class LoginActivity : AppCompatActivity() {





    @Inject
    lateinit var factory: ViewModelProvider.Factory




//      val loginModel: LoginModel by viewModels {
//        factory
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
      //  userRepository.getUser()

        findViewById<Button>(R.id.btnLogin)
            .setOnClickListener {
               // loginModel.login("","")
                startActivity(Intent(this@LoginActivity,
                    MainActivity::class.java))
            }
    }

}