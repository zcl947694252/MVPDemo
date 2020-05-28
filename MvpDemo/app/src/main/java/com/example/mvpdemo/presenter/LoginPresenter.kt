package com.example.mvpdemo.presenter
import com.example.mvpdemo.model.LoginListener
import com.example.mvpdemo.model.LoginModel
import com.example.mvpdemo.view.IView
import com.example.mvpdemo.view.LoginView


/**
 * 创建者     ZCL
 * 创建时间   2020/4/24 16:09
 * 描述
 *
 * 更新者     $
 * 更新时间   $
 * 更新描述
 */
class LoginPresenter(view: IView) : IPresenter() {

    fun login(name: String, pwd: String) {
        (iView as LoginView).loginLoading()

        (imodel as LoginModel).login(name, pwd, object : LoginListener {
            override fun onSuccess() {
                (iView as LoginView).loginSuccess()
            }

            override fun onFail() {
                (iView as LoginView).loginFail()
            }
        })
    }

    init {
        //传入view
        iView = view
        //创建mode
        imodel = LoginModel()
    }
}