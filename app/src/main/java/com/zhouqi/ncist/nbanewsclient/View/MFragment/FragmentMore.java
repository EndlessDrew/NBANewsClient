package com.zhouqi.ncist.nbanewsclient.View.MFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.View.MFragment.LoginAndLoad.LoadActivity;

/**
 * Created by z on 2017/1/6.
 */

public class FragmentMore extends Fragment implements View.OnClickListener{

    private ImageView mIcon;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more,container,false);
        mIcon = (ImageView) view.findViewById(R.id.login_icon);
        setListener();
        return view;
    }

    private void setListener(){
        mIcon.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_icon:
                //点击跳转到登陆界面
                startActivity(new Intent(getActivity(), LoadActivity.class));
        }

    }



}
