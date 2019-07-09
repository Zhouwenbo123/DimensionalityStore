package com.bawei.lib_core.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.bawei.lib_core.app.BaseApp;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 19:57,周文博
 * Description:
 */
public class SpUtils {
    private final String SP_NAMA = "wd_sp";
    private static  SpUtils mInstance;//

    private SpUtils(){

    }

    /**
     * 双重检验锁
     * @return
     */
    public static SpUtils getInstance(){

        if (mInstance==null){

            synchronized (SpUtils.class){//多线程访问，保证线程安全

                if (mInstance==null){
                    mInstance = new SpUtils();
                }

            }

        }
        return mInstance;
    }

    /**
     * sp实例
     * @return
     */
    private SharedPreferences getSp(){
        SharedPreferences sharedPreferences = BaseApp.getContext().getSharedPreferences(SP_NAMA,Context.MODE_PRIVATE);
        if (sharedPreferences!=null){
            return sharedPreferences;
        }

        return null;
    }

    /**
     * 存储数据
     * @param key
     * @param value
     */
    public void putSp(String key,String value){
        getSp().edit().putString(key,value).commit();
    }
    /**
     * 存储数据
     * @param key
     */
    public String getSp(String key){
        return getSp().getString(key,"");
    }
}
