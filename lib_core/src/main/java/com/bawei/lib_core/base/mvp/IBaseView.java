package com.bawei.lib_core.base.mvp;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 15:15,周文博
 * Description:
 */
public interface IBaseView {
    BasePresenter initPresenter();//初始化presenter方法
    void  showLoading();//显示加载框
    void  hideLoading();//隐藏加载框
    void  failure(String msg);//请求失败
}
