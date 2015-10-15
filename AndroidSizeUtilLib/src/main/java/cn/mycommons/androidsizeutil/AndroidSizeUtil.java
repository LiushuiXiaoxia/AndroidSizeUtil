package cn.mycommons.androidsizeutil;

import android.content.Context;

/**
 * AndroidSizeUtil <br/>
 * Created by xiaqiulei on 2015-10-16.
 */
public class AndroidSizeUtil {

    private static Context context;

    private static DeviceInfo deviceInfo;

    public static void init(Context context) {
        AndroidSizeUtil.context = context;
        deviceInfo = new DeviceInfo(context);
    }

    public static DimenUtil newDimenUtil() {
        return new DimenUtil(deviceInfo);
    }

    public static Context getContext() {
        return context;
    }
}