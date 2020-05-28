package com.example.mvpdemo.model


/**
 * 创建者     ZCL
 * 创建时间   2020/4/24 16:10
 * 描述
 *
 * 更新者     $
 * 更新时间   $
 * 更新描述
 */
open class LoginModel :Imodel{
    fun login(name:String,pwd:String,listener:LoginListener){
        if (name=="123"&&pwd=="0")
            listener.onSuccess()
        else
            listener.onFail()
    }
}

interface LoginListener {
  fun onSuccess()
  fun onFail()
}
