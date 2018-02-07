package com.sinothk.view.rootview;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;

import com.sinothk.view.status.R;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/1/26 11:44
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class OViewRoot {

    /**
     * 在Fragment或Activity中不要标题的场景下使用,添加内容方式
     *
     * @param currActivity
     * @param contentView
     * @return View
     */
    public static View createView4Fragment(Activity currActivity, View contentView) {
        // 1. 设置View的LayoutID
        currActivity.setContentView(R.layout.view_root_layout);

        // 2. 获得Root View
        LinearLayout rootLayout = currActivity.findViewById(R.id.rootLayoutId);

        // 3. 添加内容部分的View
        if (contentView != null) {
            rootLayout.addView(contentView);
        }

        return rootLayout;
    }

    /**
     * 在Activity中使用,添加标题和内容方式
     *
     * @param currActivity
     * @param titleBarView
     * @param contentView
     * @return View
     */
    public static View createView(Activity currActivity, View titleBarView, View contentView) {
        // 1. 设置View的LayoutID
        currActivity.setContentView(R.layout.view_root_layout);

        // 2. 获得Root View
        LinearLayout rootLayout = currActivity.findViewById(R.id.rootLayoutId);

        // 3. 添加标题TitleBar部分的View
        if (titleBarView != null) {
            rootLayout.addView(titleBarView);
        }

        // 4. 添加内容部分的View
        if (contentView != null) {
            rootLayout.addView(contentView);
        }

        return rootLayout;
    }
}
