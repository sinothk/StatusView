package com.sinothk.view.titleBars;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

    // 左边
    private static View.OnClickListener finishListener;
    private static LinearLayout titleBarLeftView;
    private static ImageView titleBarLeftIv;
    private static TextView titleBarLeftTv;

    public static View getView(final Activity cActivity) {
        currActivity = cActivity;

        titleBarView = LayoutInflater.from(currActivity).inflate(R.layout.title_bar_for_normal, null);
        // 标题
        titleBarTxt = (TextView) titleBarView.findViewById(R.id.titleBarTxt);

        // 左边
        titleBarLeftView = (LinearLayout) titleBarView.findViewById(R.id.titleBarLeftView);
        titleBarLeftIv = (ImageView) titleBarView.findViewById(R.id.titleBarLeftIv);
        titleBarLeftTv = (TextView) titleBarView.findViewById(R.id.titleBarLeftTv);
        finishListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currActivity != null) {
                    currActivity.finish();
                }
            }
        };
        titleBarLeftView.setOnClickListener(finishListener);

        // 右边
//        titleBarRightTextView
//        titleBarRightImgView

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

    public static void setTitleBg(int titleBgId) {
        if (titleBarView != null && titleBgId > 0) {
            titleBarView.setBackgroundResource(titleBgId);
        }
    }

    // =============================左边======================================

    /**
     * 设置左边View的可见性，只能 VISIBLE 或 INVISIBLE ！
     *
     * @param visible
     */
    public static void setVisible(int visible) {
        if (titleBarLeftView != null) {
            if (visible == View.VISIBLE) {
                titleBarLeftView.setVisibility(View.VISIBLE);
            } else {
                titleBarLeftView.setVisibility(View.INVISIBLE);
            }
        }
    }

    /**
     * 默认图标,自定义提示,默认退出
     *
     * @param titleLeftTxt
     */
    public static void setTitleLeft(String titleLeftTxt) {
        if (titleBarLeftView != null && finishListener != null) {
            titleBarLeftView.setOnClickListener(finishListener);
            titleBarLeftView.setVisibility(View.VISIBLE);
        }

        if (titleBarLeftTv != null && !TextUtils.isEmpty(titleLeftTxt)) {
            titleBarLeftTv.setVisibility(View.VISIBLE);
            titleBarLeftTv.setText(titleLeftTxt);
        }

    }

    /**
     * 修改图标,隐藏提示,默认退出
     *
     * @param titleLeftImgId
     */
    public static void setTitleLeft(int titleLeftImgId) {

        if (titleBarLeftView != null && finishListener != null) {
            titleBarLeftView.setOnClickListener(finishListener);
            titleBarLeftView.setVisibility(View.VISIBLE);
        }

        if (titleBarLeftIv != null) {
            titleBarLeftIv.setImageResource(titleLeftImgId);
        }
        if (titleBarLeftTv != null) {
            titleBarLeftTv.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 修改图标,隐藏提示,自定义事件
     *
     * @param titleLeftImgId
     * @param onLeftClickListener
     */
    public static void setTitleLeft(int titleLeftImgId, View.OnClickListener onLeftClickListener) {
        if (titleBarLeftView != null && onLeftClickListener != null) {
            titleBarLeftView.setOnClickListener(onLeftClickListener);
            titleBarLeftView.setVisibility(View.VISIBLE);
        }

        if (titleBarLeftIv != null) {
            titleBarLeftIv.setImageResource(titleLeftImgId);
        }
        if (titleBarLeftTv != null) {
            titleBarLeftTv.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 修改图标,自定提示,默认退出
     *
     * @param titleLeftImgId
     * @param titleLeftTxt
     */
    public static void setTitleLeft(int titleLeftImgId, String titleLeftTxt) {
        if (titleBarLeftView != null && finishListener != null) {
            titleBarLeftView.setOnClickListener(finishListener);
            titleBarLeftView.setVisibility(View.VISIBLE);
        }

        if (titleBarLeftIv != null) {
            titleBarLeftIv.setImageResource(titleLeftImgId);
        }

        if (titleBarLeftTv != null && !TextUtils.isEmpty(titleLeftTxt)) {
            titleBarLeftTv.setVisibility(View.VISIBLE);
            titleBarLeftTv.setText(titleLeftTxt);
        }
    }

    /**
     * 修改图标,自定提示,自定义事件
     *
     * @param titleLeftImgId
     * @param titleLeftTxt
     * @param onLeftClickListener
     */
    public static void setTitleLeft(int titleLeftImgId, String titleLeftTxt, View.OnClickListener onLeftClickListener) {
        if (titleBarLeftView != null && onLeftClickListener != null) {
            titleBarLeftView.setOnClickListener(onLeftClickListener);
            titleBarLeftView.setVisibility(View.VISIBLE);
        }
        if (titleBarLeftIv != null) {
            titleBarLeftIv.setImageResource(titleLeftImgId);
        }
        if (titleBarLeftTv != null && !TextUtils.isEmpty(titleLeftTxt)) {
            titleBarLeftTv.setVisibility(View.VISIBLE);
            titleBarLeftTv.setText(titleLeftTxt);
        }
    }
}
