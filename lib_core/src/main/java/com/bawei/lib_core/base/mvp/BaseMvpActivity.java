package com.bawei.lib_core.base.mvp;

import com.bawei.lib_core.base.BaseActivity;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 15:27,周文博
 * Description:
 */
public abstract class BaseMvpActivity<M extends  IBaseModel,P extends  BasePresenter> extends BaseActivity implements  IBaseView {
    public  M model;
    public  P presenter;

    @Override
    protected void initData() {
        presenter = (P) initPresenter();
        if (presenter!=null){
            model = (M) presenter.getModel();
            if (model!=null){
                //绑定
                presenter.attach(model,this);
            }
        }
        init();
    }

    protected abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            //解绑
            presenter.dettach();
        }
    }
}
