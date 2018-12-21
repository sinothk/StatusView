 
# Step 1. Add the JitPack repository to your build file

   ## Add it in your root build.gradle at the end of repositories:

        allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
   ## Step 2. Add the dependency

        dependencies {
                implementation 'com.github.sinothk:StatusView:2.0.1210'
        }
 
# 使用
    public class StatusVIew1DemoActivity extends StatusViewBaseActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);

                StatusView.showLoading(ProgressView.getView(this, "加载中"));

                new Handler().postDelayed(
                        new Runnable() {
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
        //                                // 错误
        //                                StatusView.showError();
        //                                StatusView.showError(R.mipmap.ic_launcher);
                                        StatusView.showError("服务器错误");
        //                                StatusView.showError(R.mipmap.ic_launcher, "服务器错误");
        //                                // 网络
        //                                StatusView.showNetWorkError();
        //                                StatusView.showNetWorkError(R.mipmap.ic_launcher);
        //                                StatusView.showNetWorkError("网络断开");
        //                                StatusView.showNetWorkError(R.mipmap.ic_launcher, "网络断开");
        //                                // 无数据
        //                                StatusView.showEmptyData();
        //                                StatusView.showEmptyData("暂无数据");
        //                                StatusView.showEmptyData(R.mipmap.ic_launcher);
        //                                StatusView.showEmptyData(R.mipmap.ic_launcher, "暂无数据");
        //                                StatusView.showContent();
                                    }
                                });
                            }
                        }, 3000);
            }

            @Override
            protected View.OnClickListener getContentRetryListener() {
                return null;
            }

            @Override
            protected View getTitleBarView() {
                return LayoutInflater.from(this).inflate(R.layout.activity_title, null);
            }

            @Override
            protected int getContentLayoutId() {
                return R.layout.activity_content;
            }
        }
