package com.ideal.daggerstudy.component

import com.ideal.daggerstudy.module.NetworkModule
import dagger.Component

/**
 * author : guoning
 * date: 2020/5/12 10:40
 * email: gn18667130631@gmail.com
 * desc:
 */
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

}