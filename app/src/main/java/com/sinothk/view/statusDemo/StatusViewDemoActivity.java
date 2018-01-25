package com.sinothk.view.statusDemo;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.sinothk.view.status.statusViews.StatusViewForNormal;
import com.sinothk.view.titleBars.TitleBarForNormal;

public class StatusViewDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View contentView = StatusViewForNormal.getRootLayout(this, R.layout.activity_content);
        TitleBarForNormal.addView(this, contentView);

        StatusViewForNormal.setOnRetryListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StatusViewDemoActivity.this, "onRetry", Toast.LENGTH_SHORT).show();
            }
        });

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
    }
}
