package com.zhouqi.ncist.nbanewsclient.View.MFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhouqi.ncist.nbanewsclient.R;

/**
 * Created by z on 2017/1/6.
 */

public class FragmentData extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data,container,false);
        return view;
    }
}
