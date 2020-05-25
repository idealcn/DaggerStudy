package com.ideal.daggerstudy.tools

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * author : guoning
 * date: 2020/5/25 11:07
 * email: gn18667130631@gmail.com
 * desc:
 */

fun CoroutineScope.io(block : () -> Unit) {
    CoroutineScope(Dispatchers.IO).launch {
        block()
    }
}


fun <T> launchIO(block: suspend () -> T)  {
    CoroutineScope(Dispatchers.IO).launch {
        block()
    }
}