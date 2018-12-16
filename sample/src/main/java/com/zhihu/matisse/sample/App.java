package com.zhihu.matisse.sample;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author Dengweichao @ Zhihu Inc.
 * @since 2018-12-16
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
