package com.greentea0.blackberry10androiddi.lib;

/**
 * Created by alex on 2014-05-13.
 */
public class DeviceUtil {

    public static String[] getModels(){
        return new String[]{ Constants.Q5
                , Constants.Q10
                , Constants.Z10
                , Constants.Z3
                , Constants.Z30 };
    }

    public static boolean isValidBB10Device(String manufacturer){
        return "RIM".equals(manufacturer);
    }

    public static boolean isSmallScreen(String model){
        return     Constants.Q10.equals(model)
                || Constants.Q5.equals(model);
    }
}
