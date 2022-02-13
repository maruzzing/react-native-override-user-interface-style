package com.maruzzing.rnuserinterfacestyle;

import android.content.Context;

import androidx.appcompat.app.AppCompatDelegate;

public class RNUserInterfaceStyleManager {
    public static void setSystemTheme(String theme, Boolean update) {
        if(update){
            SharedHandler.getInstance().putString("theme", theme);
        }
        if(theme.equals("dark")){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else if(theme.equals("light")){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        }
    }

    public static void initSystemTheme(Context context, String name) {
        SharedHandler.init(context, name);
        String theme = SharedHandler.getInstance().getString("theme");
        if(theme == null) {
            setSystemTheme("default", false);
        } else {
            setSystemTheme(theme, false);
        }
    }
}