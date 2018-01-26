package com.sinothk.view.titleBars;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

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
    private static View titleBarView; // 标题的View
    private static TextView titleBarTxt;
    private static Activity currActivity;

    public static View getView(Activity cActivity) {
        currActivity = cActivity;

        titleBarView = LayoutInflater.from(currActivity).inflate(R.layout.title_bar_for_normal, null);

        titleBarTxt = (TextView) titleBarView.findViewById(R.id.titleBarTxt);

        return titleBarView;
    }

    /**
     * 设置标题
     *
     * @param titleTxt
     */
    public static void setTitle(String titleTxt) {
        if (titleBarTxt != null && !TextUtils.isEmpty(titleTxt)) {
            titleBarTxt.setText(titleTxt);
        }
    }

    /**
     * 设置标题
     *
     * @param txtId
     */
    public static void setTitle(int txtId) {
        if (currActivity != null && titleBarTxt != null && txtId > 0) {
            titleBarTxt.setText(currActivity.getResources().getText(txtId));
        }
    }

    /**
     * 设置标题颜色
     *
     * @param titleTxt
     * @param txtColor
     */
    public static void setTitle(String titleTxt, int txtColor) {
        if (titleBarTxt != null && !TextUtils.isEmpty(titleTxt)) {
            titleBarTxt.setText(titleTxt);
            if (currActivity != null && txtColor > 0) {
                titleBarTxt.setTextColor(currActivity.getResources().getColor(txtColor));
            }
        }
    }

    /**
     * 设置标题颜色
     *
     * @param txtId
     * @param txtColor
     */
    public static void setTitle(int txtId, int txtColor) {
        if (currActivity != null && titleBarTxt != null && txtId > 0) {
            Resources resources = currActivity.getResources();
            titleBarTxt.setText(resources.getText(txtId));
            titleBarTxt.setTextColor(resources.getColor(txtColor));
        }
    }
}
