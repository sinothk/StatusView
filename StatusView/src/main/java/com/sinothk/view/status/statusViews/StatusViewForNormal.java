package com.sinothk.view.status.statusViews;

import android.app.Activity;
import android.view.View;

import com.sinothk.view.status.R;
import com.sinothk.view.status.lib.OnRetryListener;
import com.sinothk.view.status.lib.OnShowHideViewListener;
import com.sinothk.view.status.lib.StatusLayoutManager;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/1/25 17:30
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class StatusViewForNormal {

    private static StatusLayoutManager statusLayoutManager;
    private static View.OnClickListener onRetryListener;

    public static void setOnRetryListener(View.OnClickListener retryListener) {
        if (retryListener != null) {
            onRetryListener = retryListener;
        }
    }

    /**
     * @param currActivity    当前Activity
     * @param contentLayoutId 内容布局Id
     * @return
     */
    public static View getRootLayout(final Activity currActivity, int contentLayoutId) {
        statusLayoutManager = StatusLayoutManager.newBuilder(currActivity)
                .contentView(contentLayoutId) // 内容布局
                .emptyDataView(R.layout.status_view_empty_layout) // 数据为空
                .errorView(R.layout.status_view_error_layout) // 加载出错
                .loadingView(R.layout.status_view_loading_layout) // 加载动画
                .netWorkErrorView(R.layout.status_view_network_error_layout) // 网络错误
                .retryViewId(R.id.button_retry) // 点击重试的id
                .onShowHideViewListener(new OnShowHideViewListener() {
                    @Override
                    public void onShowView(View view, int id) {
                    }

                    @Override
                    public void onHideView(View view, int id) {
                    }
                })
                .onRetryListener(new OnRetryListener() {
                    @Override
                    public void onRetry(View view) {
                        if (onRetryListener != null) {
                            onRetryListener.onClick(view);
                        }
                    }
                })
                .build();

        return statusLayoutManager.getRootLayout();
    }

    /**
     * @param currActivity    当前Activity
     * @param contentLayoutId 内容布局Id
     * @param onClickListener 重试点击事件
     * @return
     */
    public static View getRootLayout(final Activity currActivity, int contentLayoutId, final View.OnClickListener onClickListener) {
        statusLayoutManager = StatusLayoutManager.newBuilder(currActivity)
                .contentView(contentLayoutId) // 内容布局
                .emptyDataView(R.layout.status_view_empty_layout) // 数据为空
                .errorView(R.layout.status_view_error_layout) // 加载出错
                .loadingView(R.layout.status_view_loading_layout) // 加载动画
                .netWorkErrorView(R.layout.status_view_network_error_layout) // 网络错误
                .retryViewId(R.id.button_retry) // 点击重试的id
                .onShowHideViewListener(new OnShowHideViewListener() {
                    @Override
                    public void onShowView(View view, int id) {
                    }

                    @Override
                    public void onHideView(View view, int id) {
                    }
                })
                .onRetryListener(new OnRetryListener() {
                    @Override
                    public void onRetry(View view) {
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }
                })
                .build();

        return statusLayoutManager.getRootLayout();
    }

    /**
     *
     */
    public static void showLoading() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showLoading();
        }
    }

    public static void showContent() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showContent();
        }
    }

    public static void showError() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showError();
        }
    }

    public static void showEmptyData() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showEmptyData();
        }
    }

    public static void showNetWorkError() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showNetWorkError();
        }
    }
}
