package com.sinothk.view.statusDemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sinothk.view.rootview.ORootView;
import com.sinothk.view.status.statusViews.StatusViewForNormal;
import com.sinothk.view.titleBars.TitleBarForNormal;

public class StatusViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 添加标题和内容方式1
        ORootView.createView(this, TitleBarForNormal.getView(this), StatusViewForNormal.getView(this, R.layout.activity_content));
        StatusViewForNormal.setOnRetryListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StatusViewDemoActivity.this, "onRetry", Toast.LENGTH_SHORT).show();
            }
        });

        // 添加标题和内容方式2
        ORootView.createView(this, TitleBarForNormal.getView(this), StatusViewForNormal.getView(this, R.layout.activity_content, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StatusViewDemoActivity.this, "onRetry2", Toast.LENGTH_SHORT).show();
            }
        }));
        //===========================================标题部分==============================================================
//        TitleBarForNormal.setTitle("SINOTHK");
//        TitleBarForNormal.setTitle(R.string.app_name, R.color.black);
        TitleBarForNormal.setTitle("華維公社", R.color.white);
        TitleBarForNormal.setTitleBg(R.color.colorAccent);

        // 左边
//        TitleBarForNormal.setVisible(View.VISIBLE);
        TitleBarForNormal.setTitleLeft(R.mipmap.ic_launcher, "消息(99+)");
//        TitleBarForNormal.setTitleLeft(1, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        TitleBarForNormal.setTitleLeft(1, "");
//        TitleBarForNormal.setTitleLeft(1, "", new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        // 右边


        //=============================================处理内容============================================================
        // 状态布局调用
        StatusViewForNormal.showLoading();

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                StatusViewForNormal.showError();
                            }
                        });
                    }
                }, 5000);

        // 业务内容activity_content.zml中的组件调用
        Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StatusViewDemoActivity.this, "123", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
