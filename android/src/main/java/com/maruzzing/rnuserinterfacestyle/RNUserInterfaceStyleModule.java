// RNUserInterfaceStyleModule.java

package com.maruzzing.rnuserinterfacestyle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;


public class RNUserInterfaceStyleModule extends ReactContextBaseJavaModule {
    RNUserInterfaceStyleModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    public String getName() {
        return "RNUserInterfaceStyle";
    }

    @ReactMethod
    public void getTheme(Promise promise) {
        promise.resolve(SharedHandler.getInstance().getString("theme"));
    }

    @ReactMethod
    public void setTheme(String theme, Promise promise) {
        RNUserInterfaceStyleManager.setSystemTheme(theme, true);
        promise.resolve(null);
    }
}

