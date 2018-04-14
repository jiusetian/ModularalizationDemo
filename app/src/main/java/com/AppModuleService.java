package com;


import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = RoutePaths.Service_App)
public class AppModuleService implements IAppModuleService{

    @Override
    public String getString() {
        return "测试成功";
    }

    @Override
    public void init(Context context) {

    }
}
