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
public class StatusView extends StatusViewBase {

    /**
     * @param currActivity    当前Activity
     * @param contentLayoutId 内容布局Id
     * @param onClickListener 重试点击事件
     * @return
     */
    public static View createView(final Activity currActivity, int contentLayoutId, final View.OnClickListener onClickListener) {

        statusLayoutManager = StatusLayoutManager.newBuilder(currActivity)
                .contentView(contentLayoutId) // 内容布局
                .loadingView(R.layout.status_view_loading_layout) // 加载动画
                .loadingTextTipId(R.id.loadingTxtTip)
                //
                .emptyDataView(R.layout.status_view_tip_empty_layout) // 数据为空
                .emptyDataIconImageId(R.id.statusTipIcon) // 提示图片Ip
                .emptyDataTextTipId(R.id.statusTipContent)// 提示文本Ip
                //
                .errorView(R.layout.status_view_tip_error_layout) // 加载出错
                .errorIconImageId(R.id.statusTipIcon)
                .errorTextTipId(R.id.statusTipContent)
                //
                .netWorkErrorView(R.layout.status_view_tip_network_error_layout) // 网络错误
                .netWorkErrorIconImageId(R.id.statusNetWorkErrorTipIcon)
                .netWorkErrorTextTipId(R.id.statusNetWorkErrorTipContent)
                //
                .retryViewId(R.id.statusRootView) // 点击重试的id
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

//    /**
//     * @param currActivity    当前Activity
//     * @param contentView 内容布局Id
//     * @param onClickListener 重试点击事件
//     * @return
//     */
//    public static View createView(final Activity currActivity, View contentView, final View.OnClickListener onClickListener) {
//
//        statusLayoutManager = StatusLayoutManager.newBuilder(currActivity)
//                .contentView(contentView) // 内容布局
//                .loadingView(R.layout.status_view_loading_layout) // 加载动画
//                .loadingTextTipId(R.id.loadingTxtTip)
//                //
//                .emptyDataView(R.layout.status_view_tip_empty_layout) // 数据为空
//                .emptyDataIconImageId(R.id.statusTipIcon) // 提示图片Ip
//                .emptyDataTextTipId(R.id.statusTipContent)// 提示文本Ip
//                //
//                .errorView(R.layout.status_view_tip_error_layout) // 加载出错
//                .errorIconImageId(R.id.statusTipIcon)
//                .errorTextTipId(R.id.statusTipContent)
//                //
//                .netWorkErrorView(R.layout.status_view_tip_network_error_layout) // 网络错误
//                .netWorkErrorIconImageId(R.id.statusNetWorkErrorTipIcon)
//                .netWorkErrorTextTipId(R.id.statusNetWorkErrorTipContent)
//                //
//                .retryViewId(R.id.statusRootView) // 点击重试的id
//                .onShowHideViewListener(new OnShowHideViewListener() {
//                    @Override
//                    public void onShowView(View view, int id) {
//                    }
//
//                    @Override
//                    public void onHideView(View view, int id) {
//                    }
//                })
//                .onRetryListener(new OnRetryListener() {
//                    @Override
//                    public void onRetry(View view) {
//                        if (onClickListener != null) {
//                            onClickListener.onClick(view);
//                        }
//                    }
//                })
//                .build();
//
//        return statusLayoutManager.getRootLayout();
//    }
}
