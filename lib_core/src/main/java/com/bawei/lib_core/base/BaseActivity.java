package com.bawei.lib_core.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 14:27,周文博
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {
    private  boolean isStatus;//沉浸式
    private  boolean isFullScreen;//全屏
    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayoutId());
        bind = ButterKnife.bind(this);
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int bindLayoutId();

    /**
     * 显示Toast
     * @param msg
     */
    public  void  showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * 无参跳转
     * @param clz
     */
    public  void startActivity(Class<?> clz){
        startActivity(new Intent(this,clz));
    }

    /**
     * 有参跳转
     */
    public  void startActivity(Bundle bundle,Class<?> clz){
        Intent intent = new Intent(this,clz);
        intent.putExtras(bundle);
        startActivity(intent);

    }
    /**
     *
     * @param status
     */
    public void isStatus(boolean status){
        if (status){
            //沉浸式代码
        }
    }
    /**
     *全屏
     * @param
     */
    public void isFullscreen(boolean fullscreenn) {
        if (fullscreenn) {
            //全屏代码
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解绑ButterKnife
        if (bind!=null){
            bind.unbind();
        }

    }
}
