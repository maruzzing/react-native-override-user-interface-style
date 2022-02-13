package com.maruzzing.rnuserinterfacestyle;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedHandler {
    private SharedPreferences sharedPreferences;
    private static SharedHandler sharedHandler;

    public SharedHandler(Context context, String name) {
        sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public static SharedHandler getInstance() {
        return sharedHandler;
    }

    public static void init(Context context, String name) {
        if (sharedHandler == null) {
            sharedHandler = new SharedHandler(context, name);
        }
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, (String) value).commit();
    }
}
