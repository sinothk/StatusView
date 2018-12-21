package com.sinothk.view.statusDemo;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

import com.sinothk.view.status.base.ProgressView;
import com.sinothk.view.status.base.StatusViewBaseActivity;
import com.sinothk.view.status.statusViews.StatusView;

public class StatusVIew1DemoActivity extends StatusViewBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StatusView.showLoading(ProgressView.getView(this));

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
//                                // 错误
//                                StatusView.showError();
//                                StatusView.showError(R.mipmap.ic_launcher);
                                StatusView.showError("服务器错误");
//                                StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
//                                // 网络
//                                StatusView.showNetWorkError();
//                                StatusView.showNetWorkError(R.mipmap.ic_launcher);
//                                StatusView.showNetWorkError("网络断开");
//                                StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开");
//                                // 无数据
//                                StatusView.showEmptyData();
//                                StatusView.showEmptyData("暂无数据");
//                                StatusView.showEmptyData(R.mipmap.ic_launcher);
//                                StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
//                                StatusView.showContent();
                            }
                        });
                    }
                }, 3000);
    }

    @Override
    protected View.OnClickListener getContentRetryListener() {
        return null;
    }

    @Override
    protected View getTitleBarView() {
        return LayoutInflater.from(this).inflate(R.layout.activity_title, null);
    }

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_content;
    }
}