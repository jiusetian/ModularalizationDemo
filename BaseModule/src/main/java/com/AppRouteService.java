package com;


import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

import static com.alibaba.android.arouter.utils.Consts.TAG;

public class AppRouteService {

    public static String getSomething() {
        IAppModuleService appModuleService = ARouter.getInstance().navigation(IAppModuleService.class);
        if (appModuleService!=null){
            Log.d(TAG, "getSomething: 获取的值="+appModuleService.getString());
            return appModuleService.getString();
        }
        return "";
    }

}
