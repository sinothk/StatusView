package com.sinothk.view.titleBars;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.sinothk.view.status.R;

/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/1/25 16:56
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class TitleBarForNormal {

    public static void addView(Activity currActivity, View contentView) {
        currActivity.setContentView(R.layout.title_bar_for_normal);

        LinearLayout mainLl = currActivity.findViewById(R.id.main_rl);
        mainLl.addView(contentView);

        Toolbar toolbar = (Toolbar) currActivity.findViewById(R.id.tb_bar);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("StatusLayout");
    }
}
