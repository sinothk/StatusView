package com.sinothk.view.statusDemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sinothk.view.rootview.OViewRoot;
import com.sinothk.view.status.statusViews.StatusView;
import com.sinothk.view.titleBars.TitleBarForNormal;

public class StatusViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1.在Activity中使用,添加标题和内容方式
        OViewRoot.createView(this, TitleBarForNormal.getView(this), StatusView.getNormalView(this, R.layout.activity_content, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StatusViewDemoActivity.this, "onRetry2", Toast.LENGTH_SHORT).show();
            }
        }));

//        //2. 在Fragment或Activity不要标题的场景中使用,添加标题和内容方式
//        OViewRoot.createView4Fragment(this, StatusView.getNormalView(this, R.layout.activity_content, new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(StatusViewDemoActivity.this, "onRetry2", Toast.LENGTH_SHORT).show();
//            }
//        }));

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
//        StatusView.showLoading();
        StatusView.showLoading("拼命加载中...");

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // 错误
//                                StatusView.showError();
//                                StatusView.showError(R.mipmap.ic_launcher);
                                StatusView.showError("服务器错误");
//                                StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
                                // 网络
//                                StatusView.showNetWorkError();
//                                  StatusView.showNetWorkError(R.mipmap.ic_launcher);
//                                StatusView.showNetWorkError("网络断开");
//                                StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开le");
                                // 无数据
//                                StatusView.showEmptyData();
//                                StatusView.showEmptyData("暂无数据");
//                                StatusView.showEmptyData(R.mipmap.ic_launcher);
//                                StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
                            }
                        });
                    }
                }, 3000);

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
