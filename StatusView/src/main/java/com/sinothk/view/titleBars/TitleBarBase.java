package com.sinothk.view.titleBars;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;

import com.sinothk.view.status.R;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/1/26 11:11
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class TitleBarBase {

    protected static void setContentView(Activity currActivity, View titleBarView, View contentView) {
        // 1. 设置View的LayoutID
        currActivity.setContentView(R.layout.root_layout);

        // 2. 将内容View嵌套到TitleBar的Root View中
        LinearLayout rootLayout = currActivity.findViewById(R.id.rootLayoutId);

        // 3. 添加标题TitleBar部分的View
        rootLayout.addView(titleBarView);

        // 4. 添加内容部分的View
        rootLayout.addView(contentView);
    }
}
