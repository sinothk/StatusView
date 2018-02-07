package com.sinothk.view.status.statusViews;

import android.view.View;

import com.sinothk.view.status.lib.StatusLayoutManager;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/2/7 11:33
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class StatusViewBase {
    protected static StatusLayoutManager statusLayoutManager;
    private static View.OnClickListener onRetryListener;

    public static void init() {
    }

    /**
     * 加载 ========================================
     */
    public static void showLoading() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showLoading();
        }
    }

    public static void showLoading(String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showLoading(errorInfo);
        }
    }

    public static void showLoading(View progressView) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showLoading(progressView);
        }
    }
//
//    public static void showLoading(View progressView, String tipInfo) {
//        statusLayoutManager.showLoading(progressView, tipInfo);
//    }

    /**
     * 显示内容 ============================================
     */
    public static void showContent() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showContent();
        }
    }

    /**
     * 显示错误 ============================================
     */
    public static void showError() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showError();
        }
    }

    public static void showError(int imgId) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showError(imgId, "");
        }
    }

    public static void showError(String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showError(errorInfo);
        }
    }

    public static void showError(int imgId, String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showError(imgId, errorInfo);
        }
    }

    /**
     * 显示无数据 ============================================
     */
    public static void showEmptyData() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showEmptyData();
        }
    }

    public static void showEmptyData(String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showEmptyData(errorInfo);
        }
    }

    public static void showEmptyData(int imgId) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showEmptyData(imgId);
        }
    }

    public static void showEmptyData(int imgId, String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showEmptyData(imgId, errorInfo);
        }
    }

    /**
     * 显示网络错误 ============================================
     */
    public static void showNetWorkError() {
        if (statusLayoutManager != null) {
            statusLayoutManager.showNetWorkError();
        }
    }

    public static void showNetWorkError(int imgId) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showNetWorkError(imgId, "");
        }
    }

    public static void showNetWorkError(String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showNetWorkError(errorInfo);
        }
    }

    public static void showNetWorkError(int imgId, String errorInfo) {
        if (statusLayoutManager != null) {
            statusLayoutManager.showNetWorkError(imgId, errorInfo);
        }
    }

}
