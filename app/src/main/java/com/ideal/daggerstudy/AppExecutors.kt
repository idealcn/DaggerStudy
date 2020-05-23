package com.ideal.daggerstudy

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton

/**
 * author: guo ning
 * date: 2020/5/21 10:22
 * qq: 3060974205
 * desc:
 */
@Singleton
class AppExecutors(private val diskIO :Executor,
private val networkIO : Executor,private val mainThreadExecutor : Executor) {

    @Inject
    constructor() : this(Executors.newSingleThreadExecutor(),
        Executors.newFixedThreadPool(3),
        MainThreadExecutor()
    )


    fun diskIO() : Executor= diskIO
    fun networkIO() : Executor= networkIO
    fun mainThread() : Executor= mainThreadExecutor




    private class MainThreadExecutor : Executor {

        private val mainHandler = Handler(Looper.getMainLooper())

        override fun execute(command: Runnable) {
            mainHandler.post(command)
        }

    }

}