package cn.mycommons.androidsizeutil;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Device <br/>
 * Created by xiaqiulei on 2015-10-16.
 */
class DeviceInfo {
    /**
     * 屏幕宽度，宽度小于高度
     */
    final int screenWidth;
    /**
     * 屏幕高度，高度大于宽度
     */
    final int screenHeight;
    /**
     * 屏幕密度
     */
    final float density;
    /**
     * 屏幕字体缩放
     */
    final float scaledDensity;

    DeviceInfo(Context context) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();

        // 判断宽度和高度，最后获取的高度必须大于宽度
        if (dm.heightPixels > dm.widthPixels) {
            screenWidth = dm.widthPixels;
            screenHeight = dm.heightPixels;
        } else {
            screenWidth = dm.heightPixels;
            screenHeight = dm.widthPixels;
        }

        density = dm.density;
        scaledDensity = dm.scaledDensity;
    }
}