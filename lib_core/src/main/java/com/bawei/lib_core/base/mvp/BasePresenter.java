package com.bawei.lib_core.base.mvp;

import java.lang.ref.WeakReference;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 15:01,周文博
 * Description:
 */
public abstract class BasePresenter<M,V> {
    public  M model;
    public  V view;
    private WeakReference<V> weakReference;

    public  abstract  M getModel();

    //绑定
    public  void  attach(M model,V view){
        this.model = model;
        weakReference = new WeakReference<>(view);
        this.view = weakReference.get();
    }
    //解绑
    public  void  dettach(){
        if (weakReference!=null){
            weakReference.clear();
            weakReference = null;
            this.view = null;
        }
    }
}
