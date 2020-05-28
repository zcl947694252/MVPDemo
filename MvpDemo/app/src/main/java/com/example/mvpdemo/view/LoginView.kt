package com.example.mvpdemo.view


/**
 * 创建者     ZCL
 * 创建时间   2020/4/24 16:15
 * 描述
 *
 * 更新者     $
 * 更新时间   $
 * 更新描述
 */
interface LoginView : IView {
    fun loginSuccess()
    fun loginLoading()
    fun loginFail()
}