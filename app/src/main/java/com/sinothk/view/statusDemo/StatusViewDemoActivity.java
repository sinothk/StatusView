package com.sinothk.view.statusDemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sinothk.view.rootview.OViewRoot;
import com.sinothk.view.status.statusViews.StatusView;
import com.sinothk.view.titleBars.TitleBar4Normal;

public class StatusViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1.在Activity中使用,添加标题和内容方式
        OViewRoot.createView(this, TitleBar4Normal.getView(this), StatusView.getNormalView(this, R.layout.activity_content, new View.OnClickListener() {
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
//        TitleBar4Normal.setTitle("SINOTHK");
//        TitleBar4Normal.setTitle("華維公社", R.color.white);
        TitleBar4Normal.setTitle("華維公社", R.color.white, R.color.black);

        //===========================================左标题部分==============================================================
        TitleBar4Normal.setVisible(View.INVISIBLE);
//        TitleBar4Normal.setTitleLeft(R.mipmap.ic_launcher);
//        TitleBar4Normal.setTitleLeft(R.mipmap.ic_launcher, "消息(99+)");
//        TitleBar4Normal.setTitleLeft(R.mipmap.ic_launcher, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleLeft:仅有图片", Toast.LENGTH_SHORT).show();
//            }
//        });
//        TitleBar4Normal.setTitleLeft(R.mipmap.ic_launcher, "发现", new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleLeft：图片和文字", Toast.LENGTH_SHORT).show();
//            }
//        });
        //===========================================右标题部分==============================================================
//        TitleBar4Normal.setTitleRightTxt0("搜索", R.color.white, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleRightTxt0", Toast.LENGTH_SHORT).show();
//            }
//        });
//        TitleBar4Normal.setTitleRightTxt1("设置", R.color.white, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleRightTxt1", Toast.LENGTH_SHORT).show();
//            }
//        });

//        TitleBar4Normal.setTitleRightIv0(R.mipmap.ic_launcher, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleRightIv0", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        TitleBar4Normal.setTitleRightIv1(R.mipmap.ic_launcher, new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "setTitleRightIv1", Toast.LENGTH_SHORT).show();
//            }
//        });

//        TitleBar4Normal.setTitleRightTv0Visible(true);
//        TitleBar4Normal.setTitleRightTv1Visible(true);

//        TitleBar4Normal.setTitleRightIv0Visible(false);
//        TitleBar4Normal.setTitleRightIv1Visible(false);

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
//                                StatusView.showError("服务器错误");
//                                StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
                                // 网络
//                                StatusView.showNetWorkError();
//                                  StatusView.showNetWorkError(R.mipmap.ic_launcher);
//                                StatusView.showNetWorkError("网络断开");
//                                StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开le");
                                // 无数据
//                                StatusView.showEmptyData();
                                StatusView.showEmptyData("暂无数据");
//                                StatusView.showEmptyData(R.mipmap.ic_launcher);
//                                StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
//                                StatusView.showContent();
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
