package com.bawei.lib_core.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Copyright (C), 2015-2019, 八维集团
 * Author: Machenike
 * Date: 2019/7/9 19:36,周文博
 * Description:
 */
public class DialogUtil extends ProgressDialog {
    public DialogUtil(Context context) {
        super(context);
    }

    public DialogUtil(Context context, int theme) {
        super(context, theme);
    }
}
