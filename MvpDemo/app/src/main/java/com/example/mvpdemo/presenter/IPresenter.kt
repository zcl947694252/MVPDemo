package com.example.mvpdemo.presenter

import com.example.mvpdemo.model.Imodel
import com.example.mvpdemo.view.IView


/**
 * 创建者     ZCL
 * 创建时间   2020/4/24 16:14
 * 描述
 *
 * 更新者     $
 * 更新时间   $
 * 更新描述
 */
open class IPresenter{
    open lateinit var imodel:Imodel
    open lateinit var iView:IView
}