package com.sinothk.view.status.lib;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/**
 * Created by chenpengfei on 2016/12/15.
 */
public class StatusLayoutManager {

    final Context context;
    final ViewStub netWorkErrorVs;
    final int netWorkErrorRetryViewId;
    final int netWorkErrorIconImageId;
    final int netWorkErrorTextTipId;

    final ViewStub emptyDataVs;
    final int emptyDataRetryViewId;
    final ViewStub errorVs;
    final int errorRetryViewId;
    // 加载View
    final int loadingLayoutResId;
    final int loadingIconImageId;
    final int loadingTextTipId;

    final int contentLayoutResId;
    final int retryViewId;

    final int emptyDataIconImageId;
    final int emptyDataTextTipId;

    final int errorIconImageId;
    final int errorTextTipId;

    final AbsLayout errorLayout;
    final AbsLayout emptyDataLayout;

    final RootFrameLayout rootFrameLayout;
    final OnShowHideViewListener onShowHideViewListener;
    final OnRetryListener onRetryListener;

    public StatusLayoutManager(Builder builder) {
        this.context = builder.context;

        this.loadingLayoutResId = builder.loadingLayoutResId;
        this.loadingIconImageId = builder.loadingIconImageId;
        this.loadingTextTipId = builder.loadingTextTipId;

        this.netWorkErrorVs = builder.netWorkErrorVs;
        this.netWorkErrorRetryViewId = builder.netWorkErrorRetryViewId;
        this.emptyDataVs = builder.emptyDataVs;
        this.emptyDataRetryViewId = builder.emptyDataRetryViewId;
        this.errorVs = builder.errorVs;
        this.errorRetryViewId = builder.errorRetryViewId;
        this.contentLayoutResId = builder.contentLayoutResId;
        this.onShowHideViewListener = builder.onShowHideViewListener;
        this.retryViewId = builder.retryViewId;
        this.onRetryListener = builder.onRetryListener;
        this.emptyDataIconImageId = builder.emptyDataIconImageId;
        this.emptyDataTextTipId = builder.emptyDataTextTipId;
        this.errorIconImageId = builder.errorIconImageId;
        this.errorTextTipId = builder.errorTextTipId;
        this.errorLayout = builder.errorLayout;
        this.emptyDataLayout = builder.emptyDataLayout;

        this.netWorkErrorIconImageId = builder.netWorkErrorIconImageId;
        this.netWorkErrorTextTipId = builder.netWorkErrorTextTipId;

        rootFrameLayout = new RootFrameLayout(this.context);
        rootFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        rootFrameLayout.setStatusLayoutManager(this);
    }


    /**
     * 显示loading
     */
    public void showLoading() {
        rootFrameLayout.showLoading();
    }

    public void showLoading(String errorInfo) {
        rootFrameLayout.showLoading(errorInfo);
    }

    public void showLoading(View progressView) {
        rootFrameLayout.showLoading(progressView);
    }

//    public void showLoading(View progressView, String tipInfo) {
//        rootFrameLayout.showLoading(progressView, tipInfo);
//    }

    /**
     * 显示内容
     */
    public void showContent() {
        rootFrameLayout.showContent();
    }

    /**
     * 显示空数据
     */
    public void showEmptyData(int iconImage, String textTip) {
        rootFrameLayout.showEmptyData(iconImage, textTip);
    }

    public void showEmptyData() {
        showEmptyData(0, "");
    }

    public void showEmptyData(String textTip) {
        showEmptyData(0, textTip);
    }

    public void showEmptyData(int imgId) {
        showEmptyData(imgId, "");
    }

    public void showLayoutEmptyData(Object... objects) {
        rootFrameLayout.showLayoutEmptyData(objects);
    }

    /**
     * 显示网络异常
     */
    public void showNetWorkError() {
        rootFrameLayout.showNetWorkError();
    }

    public void showNetWorkError(String errorInfo) {
        rootFrameLayout.showNetWorkError(0, errorInfo);
    }

    public void showNetWorkError(int imgId, String errorInfo) {
        rootFrameLayout.showNetWorkError(imgId, errorInfo);
    }

    /**
     * 显示异常
     */
    public void showError(int iconImage, String textTip) {
        rootFrameLayout.showError(iconImage, textTip);
    }

    public void showError() {
        showError(0, "");
    }

    public void showError(String textTip) {
        showError(0, textTip);
    }

    public void showLayoutError(Object... objects) {
        rootFrameLayout.showLayoutError(objects);
    }

    /**
     * 得到root 布局
     */
    public View getRootLayout() {
        return rootFrameLayout;
    }

    public static final class Builder {

        private Context context;
        private int loadingLayoutResId;
        private int loadingIconImageId;
        private int loadingTextTipId;

        private int contentLayoutResId;
        private ViewStub netWorkErrorVs;
        private int netWorkErrorRetryViewId;
        private int netWorkErrorIconImageId;
        private int netWorkErrorTextTipId;

        private ViewStub emptyDataVs;
        private int emptyDataRetryViewId;
        private ViewStub errorVs;
        private int errorRetryViewId;
        private int retryViewId;
        private int emptyDataIconImageId;
        private int emptyDataTextTipId;
        private int errorIconImageId;
        private int errorTextTipId;
        private AbsLayout errorLayout;
        private AbsLayout emptyDataLayout;
        private OnShowHideViewListener onShowHideViewListener;
        private OnRetryListener onRetryListener;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder loadingView(@LayoutRes int loadingLayoutResId) {
            this.loadingLayoutResId = loadingLayoutResId;
            return this;
        }

        public Builder loadingIconImageId(int loadingIconImageId) {
            this.loadingIconImageId = loadingIconImageId;
            return this;
        }

        public Builder loadingTextTipId(int loadingTextTipId) {
            this.loadingTextTipId = loadingTextTipId;
            return this;
        }

        public Builder netWorkErrorView(@LayoutRes int newWorkErrorId) {
            netWorkErrorVs = new ViewStub(context);
            netWorkErrorVs.setLayoutResource(newWorkErrorId);
            return this;
        }

        public Builder emptyDataView(@LayoutRes int noDataViewId) {
            emptyDataVs = new ViewStub(context);
            emptyDataVs.setLayoutResource(noDataViewId);
            return this;
        }

        public Builder errorView(@LayoutRes int errorViewId) {
            errorVs = new ViewStub(context);
            errorVs.setLayoutResource(errorViewId);
            return this;
        }

        public Builder contentView(@LayoutRes int contentLayoutResId) {
            this.contentLayoutResId = contentLayoutResId;
            return this;
        }

        public Builder errorLayout(AbsLayout errorLayout) {
            this.errorLayout = errorLayout;
            this.errorVs = errorLayout.getLayoutVs();
            return this;
        }

        public Builder emptyDataLayout(AbsLayout emptyDataLayout) {
            this.emptyDataLayout = emptyDataLayout;
            this.emptyDataVs = emptyDataLayout.getLayoutVs();
            return this;
        }

        public Builder netWorkErrorRetryViewId(int netWorkErrorRetryViewId) {
            this.netWorkErrorRetryViewId = netWorkErrorRetryViewId;
            return this;
        }

        public Builder netWorkErrorIconImageId(int netWorkErrorIconImageId) {
            this.netWorkErrorIconImageId = netWorkErrorIconImageId;
            return this;
        }

        public Builder netWorkErrorTextTipId(int netWorkErrorTextTipId) {
            this.netWorkErrorTextTipId = netWorkErrorTextTipId;
            return this;
        }

        public Builder emptyDataRetryViewId(int emptyDataRetryViewId) {
            this.emptyDataRetryViewId = emptyDataRetryViewId;
            return this;
        }

        public Builder errorRetryViewId(int errorRetryViewId) {
            this.errorRetryViewId = errorRetryViewId;
            return this;
        }

        public Builder retryViewId(int retryViewId) {
            this.retryViewId = retryViewId;
            return this;
        }

        public Builder emptyDataIconImageId(int emptyDataIconImageId) {
            this.emptyDataIconImageId = emptyDataIconImageId;
            return this;
        }

        public Builder emptyDataTextTipId(int emptyDataTextTipId) {
            this.emptyDataTextTipId = emptyDataTextTipId;
            return this;
        }

        public Builder errorIconImageId(int errorIconImageId) {
            this.errorIconImageId = errorIconImageId;
            return this;
        }

        public Builder errorTextTipId(int errorTextTipId) {
            this.errorTextTipId = errorTextTipId;
            return this;
        }

        public Builder onShowHideViewListener(OnShowHideViewListener onShowHideViewListener) {
            this.onShowHideViewListener = onShowHideViewListener;
            return this;
        }

        public Builder onRetryListener(OnRetryListener onRetryListener) {
            this.onRetryListener = onRetryListener;
            return this;
        }

        public StatusLayoutManager build() {
            return new StatusLayoutManager(this);
        }
    }

    public static Builder newBuilder(Context context) {
        return new Builder(context);
    }

}
