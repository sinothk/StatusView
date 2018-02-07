package com.sinothk.view.statusDemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;


/**
 * <pre>
 *  @author 梁玉涛 (https://github.com/sinothk)
 *  @Create 2018/2/7 15:46
 *  @Project: StatusViewLib
 *  @Description:
 *  @Update:
 * <pre>
 */
public class ProgressView {
    public static View getView(Activity currActivity, String tipInfo) {
        View view = LayoutInflater.from(currActivity).inflate(R.layout.progress_view, null);
        TextView loadingTxtTip = view.findViewById(R.id.loadingTxtTip);
        loadingTxtTip.setText(tipInfo);
        return view;
    }
}
