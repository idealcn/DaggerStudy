package com.ideal.daggerstudy.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ideal.daggerstudy.R
import com.ideal.daggerstudy.model.LoginModel
import dagger.android.AndroidInjection

/**
 * author : guoning
 * date: 2020/5/12 7:43
 * email: gn18667130631@gmail.com
 * desc:
 */
class LoginActivity : AppCompatActivity() {


    private  val loginModel: LoginModel by lazy {
        defaultViewModelProviderFactory.create(LoginModel::class.java)
    }






    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      //  userRepository.getUser()

        findViewById<Button>(R.id.btnLogin)
            .setOnClickListener {
               // loginModel.login("","")
                startActivity(Intent(this@LoginActivity,
                    UserListActivity::class.java))
            }
    }

}