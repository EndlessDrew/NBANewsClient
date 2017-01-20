package com.zhouqi.ncist.nbanewsclient.View.SplashScreen;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.zhouqi.ncist.nbanewsclient.MainActivity;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.Utils.UtilsShared;
import com.zhouqi.ncist.nbanewsclient.model.dbmodel.DBLogin;

import org.litepal.tablemanager.Connector;

/**
 * 开屏页面，每次进入App先进入这个页面
 */
public class SplashActivity extends Activity {
    /**
     * 动画界面显示的 NBA中国官方APP
     */
    private ImageView mIv_splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //设置全屏 无状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fullscreen);
        initView();
    }



    /**
     * 加载布局，给界面设置动画，跳转到导航页面
     */
    private void initView() {
        mIv_splash = (ImageView) findViewById(R.id.iv_splash);
        AlphaAnimation animation = new AlphaAnimation(0.5f, 1);
        animation.setDuration(3000);
//        mIv_splash.setAnimation(animation);
        mIv_splash.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                /**
                 * 动画结束后，跳转到主界面
                 * 判断文件状态是否存在，如果存在则设置跳转到主界面，
                 * 如果不存在则设置跳转到导航页面
                 * 只需要调用共有方法修改状态
                 */
                if(UtilsShared.getSplashState(SplashActivity.this)){
                    //跳转到主界面，关闭动画页面
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }else{
                    //跳转到导航页面，关闭广告页面
                    startActivity(new Intent(SplashActivity.this, StartPagesActivity.class));
                    finish();
                }

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
