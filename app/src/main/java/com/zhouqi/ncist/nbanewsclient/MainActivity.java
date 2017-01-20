package com.zhouqi.ncist.nbanewsclient;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Window;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


import com.zhouqi.ncist.nbanewsclient.Utils.FragmentFactory;

import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentGame;


import java.text.SimpleDateFormat;

public class MainActivity extends FragmentActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRb_game;
    private TextView mTv_title;
    private FragmentManager mFragmentManager;
    private MainActivity mMainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mMainActivity = this;
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_type);
        mRb_game  = (RadioButton) findViewById(R.id.rb_game);
        mRb_game.setChecked(true);
        mTv_title = (TextView) findViewById(R.id.tv_title);
        setDefaultFragment();
        mFragmentManager = getSupportFragmentManager();
        initView();
        getTIme();

    }
    public void setTv_title(String title){
        mTv_title.setText(title);
    }

    private void getTIme(){
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = sDateFormat.format(new java.util.Date());
          Log.i("Drew","当前时间为"+date);
    }

    private  void  setDefaultFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fw_content, new FragmentGame());
        fragmentTransaction.commit();

    }
    /**
     * 加载布局和监听
     */
    private void initView() {
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = mFragmentManager.beginTransaction();
                Fragment fragment = FragmentFactory.getInstanceByIndex(checkedId,mMainActivity);
                transaction.replace(R.id.fw_content, fragment);
                transaction.commit();
            }
        });
    }


}
