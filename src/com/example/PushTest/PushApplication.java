package com.example.PushTest;

import android.app.Application;
import cn.jpush.android.api.JPushInterface;

/**
 * PushTest
 * Created on 2015/10/13.
 * Author:chendong
 * Email:15054297071@163.com
 * CSDN: chendong_
 */
public class PushApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
