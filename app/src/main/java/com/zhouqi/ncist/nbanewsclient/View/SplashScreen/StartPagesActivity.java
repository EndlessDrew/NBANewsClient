package com.zhouqi.ncist.nbanewsclient.View.SplashScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.zhouqi.ncist.nbanewsclient.MainActivity;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.Utils.UtilsShared;
import com.zhouqi.ncist.nbanewsclient.model.dbmodel.DBLogin;

import org.litepal.tablemanager.Connector;

import java.util.ArrayList;
import java.util.List;

public class StartPagesActivity extends Activity {
    //导入时的三个滑动界面
    private LinearLayout view1,view2,view3;
    private  RelativeLayout view4;
    private List<View> viewList ;
    private ViewPager mVp;
    private ImageButton mImb_1;
    private ImageButton mImb_2;
    private ImageButton mImb_3;
    private ImageButton mImb_4;
    private Button bt_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置全屏 无状态栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_pages);
        //导航页面开启创建数据库
        Connector.getDatabase();
        initView();
    }
    private  void initView (){
        mVp = (ViewPager) findViewById(R.id.vp_startPages);
        mImb_1 = (ImageButton) findViewById(R.id.imb_1);
        mImb_2 = (ImageButton) findViewById(R.id.imb_2);
        mImb_3 = (ImageButton) findViewById(R.id.imb_3);
        mImb_4 = (ImageButton) findViewById(R.id.imb_4);
        //设置第一张为默认图片
        mImb_1.setImageResource(R.mipmap.circle_true);
        LayoutInflater inflater = getLayoutInflater();
        view1 = (LinearLayout) inflater.inflate(R.layout.viewpager_one,null);
        view2 = (LinearLayout) inflater.inflate(R.layout.viewpager_two,null);
        view3 = (LinearLayout) inflater.inflate(R.layout.viewpager_three,null);
        view4 = (RelativeLayout) inflater.inflate(R.layout.viewpager_four,null);
        bt_start = (Button) view4.findViewById(R.id.bt_vp_three);

        viewList = new ArrayList<View>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);
        viewList.add(view4);
        mVp.setAdapter(new MyViewpageAdapter());
        mVp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case  0:
                        mImb_1.setImageResource(R.mipmap.circle_true);
                        mImb_2.setImageResource(R.mipmap.circle);
                        mImb_3.setImageResource(R.mipmap.circle);
                        mImb_4.setImageResource(R.mipmap.circle);
                        break;
                    case 1:
                        mImb_1.setImageResource(R.mipmap.circle);
                        mImb_2.setImageResource(R.mipmap.circle_true);
                        mImb_3.setImageResource(R.mipmap.circle);
                        mImb_4.setImageResource(R.mipmap.circle);
                        break;
                    case 2:
                        mImb_1.setImageResource(R.mipmap.circle);
                        mImb_2.setImageResource(R.mipmap.circle);
                        mImb_3.setImageResource(R.mipmap.circle_true);
                        mImb_4.setImageResource(R.mipmap.circle);
                        break;
                    case 3:
                        mImb_1.setImageResource(R.mipmap.circle);
                        mImb_2.setImageResource(R.mipmap.circle);
                        mImb_3.setImageResource(R.mipmap.circle);
                        mImb_4.setImageResource(R.mipmap.circle_true);
                        bt_start.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                UtilsShared.setSplashState(StartPagesActivity.this);
                                addDbData();
                                startActivity(new Intent(StartPagesActivity.this,MainActivity.class));
                                finish();
                            }
                        });
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    /**
     * 滑动界面的适配器
     */
    class  MyViewpageAdapter extends PagerAdapter {
        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(viewList.get(position));
        }
    }


    /**
     * 加载动画前创建数据库数据，即用来做登陆处理
     */
    private void addDbData() {
        DBLogin dbLogin = new DBLogin();
        dbLogin.setLoad(false);
        dbLogin.setUsername("276156372@qq.com");
        dbLogin.setPassword("123321");
        dbLogin.setLogin(true);
        dbLogin.save();

        DBLogin dbLogin1 = new DBLogin();
        dbLogin1.setLoad(false);
        dbLogin1.setUsername("12345678@qq.com");
        dbLogin1.setPassword("12345678");
        dbLogin1.setLogin(true);
        dbLogin1.save();
        DBLogin dbLogin2 = new DBLogin();
        dbLogin2.setLoad(false);
        dbLogin2.setUsername("123456@qq.com");
        dbLogin2.setPassword("123456");
        dbLogin2.setLogin(true);
        dbLogin2.save();
        DBLogin dbLogin3 = new DBLogin();
        dbLogin3.setLoad(false);
        dbLogin3.setUsername("1234567@qq.com");
        dbLogin3.setPassword("1234567");
        dbLogin3.setLogin(true);
        dbLogin3.save();
        DBLogin dbLogin4 = new DBLogin();
        dbLogin4.setLoad(false);
        dbLogin4.setUsername("123456789@qq.com");
        dbLogin4.setPassword("123456789");
        dbLogin4.setLogin(true);
        dbLogin4.save();
        DBLogin dbLogin5 = new DBLogin();
        dbLogin5.setLoad(false);
        dbLogin5.setUsername("1287547683@qq.com");
        dbLogin5.setPassword("123321");
        dbLogin5.setLogin(true);
        dbLogin5.save();
    }
}
