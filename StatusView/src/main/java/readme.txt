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