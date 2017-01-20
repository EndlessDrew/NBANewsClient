package com.zhouqi.ncist.nbanewsclient.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Drew on 2017/1/4.
 */

public class UtilsShared {


    /**
     * 设置开屏页面的存储状态
     *
     * @param context
     */
    public static void setSplashState(Context context) {
        SharedPreferences sp = context.getSharedPreferences(PublicData.SplashState, Context.MODE_APPEND);
        SharedPreferences.Editor edit = sp.edit();
        edit.putBoolean(PublicData.SplashState, true);
        edit.commit();
    }

    public static boolean getSplashState(Context context) {
        SharedPreferences sp = context.getSharedPreferences(PublicData.SplashState, Context.MODE_APPEND);
        return sp.getBoolean(PublicData.SplashState, false);
    }
}
