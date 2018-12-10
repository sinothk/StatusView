package com.sinothk.view.status.base;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.sinothk.view.status.R;
import com.sinothk.view.status.statusViews.StatusView;

/**
 * <pre>
 *  创建:  梁玉涛 2018/12/10 on 14:40
 *  项目:  StatusViewLib
 *  描述:
 *  更新:
 * <pre>
 */
public abstract class StatusViewBaseActivity extends AppCompatActivity {

//    private View titleBarView;
//    private int contentLayoutId;
//
//    protected void setLayout(View titleBarView, int contentId) {
//        this.titleBarView = titleBarView;
//        this.contentLayoutId = contentId;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.status_view_base_layout);

        LinearLayout statusViewTopLayout = this.findViewById(R.id.statusViewTopLayout);
        LinearLayout statusViewContentLayout = this.findViewById(R.id.statusViewContentLayout);

        // 头部
        statusViewTopLayout.addView(getTitleBarView(), new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        // 内容
        View statusView = StatusView.createView(this, getContentLayoutId(), getContentRetryListener());
        statusViewContentLayout.addView(statusView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

//        StatusView.showLoading(ProgressView.getView(this, "加载中"));
////        // 错误
////        StatusView.showError();
////        StatusView.showError(R.mipmap.ic_launcher);
////        StatusView.showError("服务器错误");
////        StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
////        // 网络
////        StatusView.showNetWorkError();
////        StatusView.showNetWorkError(R.mipmap.ic_launcher);
////        StatusView.showNetWorkError("网络断开");
////        StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开");
////        // 无数据
////        StatusView.showEmptyData();
////        StatusView.showEmptyData("暂无数据");
////        StatusView.showEmptyData(R.mipmap.ic_launcher);
////        StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
////        StatusView.showContent();
//        new Handler().postDelayed(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
////                                // 错误
////                                StatusView.showError();
////                                StatusView.showError(R.mipmap.ic_launcher);
//                                StatusView.showError("服务器错误");
////                                StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
////                                // 网络
////                                StatusView.showNetWorkError();
////                                StatusView.showNetWorkError(R.mipmap.ic_launcher);
////                                StatusView.showNetWorkError("网络断开");
////                                StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开");
////                                // 无数据
////                                StatusView.showEmptyData();
////                                StatusView.showEmptyData("暂无数据");
////                                StatusView.showEmptyData(R.mipmap.ic_launcher);
////                                StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
////                                StatusView.showContent();
//                            }
//                        });
//                    }
//                }, 3000);
    }

    protected abstract View.OnClickListener getContentRetryListener();

    protected abstract View getTitleBarView();

    protected abstract int getContentLayoutId();

}
