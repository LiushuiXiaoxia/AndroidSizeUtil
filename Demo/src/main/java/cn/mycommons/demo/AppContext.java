package cn.mycommons.demo;

import android.app.Application;

import cn.mycommons.androidsizeutil.AndroidSizeUtil;

/**
 * AppContext <br/>
 * Created by xiaqiulei on 2015-10-16.
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AndroidSizeUtil.init(this);
    }
}