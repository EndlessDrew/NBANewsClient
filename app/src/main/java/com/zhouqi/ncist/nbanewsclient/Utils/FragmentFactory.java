package com.zhouqi.ncist.nbanewsclient.Utils;

import android.support.v4.app.Fragment;

import com.zhouqi.ncist.nbanewsclient.MainActivity;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentData;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentGame;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentLatest;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentMore;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.FragmentVideo;

/**
 * Created by z on 2017/1/19.
 */

public class FragmentFactory {

    public static Fragment getInstanceByIndex(int index,MainActivity activity){
        Fragment fragment = null;
        switch (index){
            case R.id.rb_game:
                fragment = new FragmentGame();
                activity.setTv_title("赛程");
                break;
            case R.id.rb_latest:
                fragment = new FragmentLatest();
                activity.setTv_title("最新");
                break;
            case R.id.rb_video:
                fragment = new FragmentVideo();
                activity.setTv_title("视频");
                break;
            case  R.id.rb_data:
                fragment = new FragmentData();
                activity.setTv_title("数据");
                break;
            case R.id.rb_more:
                fragment = new FragmentMore();
                activity.setTv_title("更多");
                break;
        }
        return  fragment;
    }
}
