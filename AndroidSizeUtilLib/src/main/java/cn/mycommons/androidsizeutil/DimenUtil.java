package cn.mycommons.androidsizeutil;

/**
 * DimenUtil <br/>
 * Created by xiaqiulei on 2015-10-15.
 */
public class DimenUtil {

    private DeviceInfo deviceInfo;

    protected DimenUtil(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    /**
     * 获取屏幕的宽度,固定值
     *
     * @return
     */
    public int getSw() {
        return getScreenWidth();
    }

    /**
     * 获取屏幕的宽度,固定值
     *
     * @return
     */
    public int getScreenWidth() {
        return deviceInfo.screenWidth;
    }

    /**
     * 获取屏幕当前宽度，值不固定
     *
     * @return
     */
    public int getCsw() {
        return getCurrentScreenWidth();
    }

    /**
     * 获取屏幕当前宽度，值不固定
     *
     * @return
     */
    public int getCurrentScreenWidth() {
        return AndroidSizeUtil.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 获取屏幕的高度,固定值
     *
     * @return
     */
    public int getSh() {
        return getScreenHeight();
    }

    /**
     * 获取屏幕的高度,固定值
     *
     * @return
     */
    public int getScreenHeight() {
        return deviceInfo.screenHeight;
    }

    /**
     * 获取屏幕当前高度，值不固定
     *
     * @return
     */
    public int getCsh() {
        return getCurrentScreenHeight();
    }

    /**
     * 获取屏幕当前高度，值不固定
     *
     * @return
     */
    public int getCurrentScreenHeight() {
        return AndroidSizeUtil.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    public float getD() {
        return getDensity();
    }

    public float getDensity() {
        return deviceInfo.density;
    }

    public int px(float px) {
        return (int) px;
    }

    public int dp(float dp) {
        return (int) (deviceInfo.density * dp + 0.5F);
    }

    public int sp(float sp) {
        return (int) (sp * deviceInfo.density + 0.5f);
    }

    public int[] size(int width, int height) {
        return new int[]{width, height};
    }

    public int[] sizeDp(int width, int height) {
        return new int[]{dp(width), dp(height)};
    }
}