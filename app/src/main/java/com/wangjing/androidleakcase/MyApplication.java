package com.wangjing.androidleakcase;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by wangjing on 2017/4/25.
 */

public class MyApplication extends Application {

    private Context mContext;
    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        mContext = this;
        instance = this;
    }


    public static MyApplication getInstance() {
        if (instance == null) {
            instance = new MyApplication();
        }
        return instance;
    }

    public Context getmContext() {
        if (mContext == null) {
            mContext = this;
        }
        return mContext;
    }
}
