package com.wolfsea.windowsoftinputmodetest.util
import android.app.Activity
import android.content.Intent

/**
 *@desc  Activity工具类
 *@author liuliheng
 *@time 2021/5/17  0:36
 **/
object ActivityUtil {

    //跳转Activity
    inline fun <reified T : Activity> Activity.startActivity() {
        startActivity(Intent(this, T::class.java))
    }

}