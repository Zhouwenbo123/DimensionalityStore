package com.bawei.lib_core.net;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 20:05,周文博
 * Description:
 */
public interface OkhttpCallback {
    void  success(String result);//数据合法
    void  failure(String msg);
}
