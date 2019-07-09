package com.bawei.lib_core.app;

import android.app.Application;
import android.content.Context;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 19:58,周文博
 * Description:
 */
public class BaseApp extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
