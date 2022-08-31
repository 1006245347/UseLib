package cn.hwj.uselib;

import android.app.Application;

import com.lyentech.sdk.GreeNp;


public class UbApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        GreeNp.init(this, "02EBA73C32A2AF47552FA411135E2CBA",true);

        System.out.println("111");
        System.out.println("222");
        System.out.println("333");
    }
}

