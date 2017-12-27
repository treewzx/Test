package com.wzx.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/12/27 0027.
 */

public  class ToastUtil {

    public static void showToast(Context context, String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
}
