package com.bawei.lib_core.utils;

import android.util.Log;

import com.bawei.lib_core.common.Constants;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 19:40,周文博
 * Description:
 */
public class LogUtils {
    private  static  String TAG = LogUtils.class.getSimpleName();

    public  static  void  d(String msg){
        if (!Constants.IS_RELEASE){//如果不是正版环境
            Log.d(TAG,msg);
        }
    }
    ;public  static  void  e(String msg){
        if (!Constants.IS_RELEASE){
            Log.e(TAG,msg);
        }
    }
}
