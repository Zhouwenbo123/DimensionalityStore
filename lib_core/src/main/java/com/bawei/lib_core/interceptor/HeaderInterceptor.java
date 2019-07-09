package com.bawei.lib_core.interceptor;

import com.bawei.lib_core.utils.SpUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 20:02,周文博
 * Description:
 */
public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request.Builder builder = request.newBuilder();
        //
        builder.addHeader("userId",SpUtils.getInstance().getSp("userId"));
        builder.addHeader("sessionId",SpUtils.getInstance().getSp("sessionId"));
        Request nrequest = builder.build();

        Response response = chain.proceed(nrequest);
        return response;
    }
}
