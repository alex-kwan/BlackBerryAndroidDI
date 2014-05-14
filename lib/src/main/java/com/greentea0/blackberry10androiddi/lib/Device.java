package com.greentea0.blackberry10androiddi.lib;

import android.os.Build;

/**
 * Created by alex on 2014-05-13.
 */

public class Device {

    private boolean isSmallDevice;
    private boolean isBB;

    private static Device _instance;
    private Device(){
    }
    public static Device getInstance(){
        if( null == _instance ) {
            _instance = new Device();
            _instance.init(android.os.Build.MODEL, Build.MANUFACTURER);
        }
        return _instance;
    }

    private void init(String model, String manufacturer){
        isSmallDevice = DeviceUtil.isSmallScreen(model);
        isBB = DeviceUtil.isValidBB10Device(manufacturer);
    }

    public boolean isSmallDevice(){
        return isSmallDevice;
    }
    public boolean isBlackBerry(){
        return isBB;
    }
}
