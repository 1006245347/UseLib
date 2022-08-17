package cn.hwj.uselib;

import android.app.Application;

import cn.hwj.sdk.GreeNp;

public class UbApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GreeNp.init(this, "6BD8A496699787957A8132C10020A872","cccc1");
    }
}

