package com.universitaria.cesmag.institucinuniversitariacesmag;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

public class SharedPreferencesHelper {

    public static String SHARED_PREFERENCES_FILE = "testLandscape" ;
    public static void setSharePref(Context context, String key, String value){
        SharedPreferences sharedPref=context.getSharedPreferences(SHARED_PREFERENCES_FILE,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key,value);
        editor.commit();
    }

    public  static String getStringSharedPref(Context context , String key)
    {
        SharedPreferences sharedPref = context.getSharedPreferences(SHARED_PREFERENCES_FILE , Context.MODE_PRIVATE);
        String defaultValue = "p";
        return sharedPref.getString(key, defaultValue);

    }
}
