package com.sinothk.view.statusDemo;

import android.app.Application;

import com.sinothk.view.status.statusViews.StatusView;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/2/7 11:31
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        StatusView.init();
    }
}
