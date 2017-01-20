package com.zhouqi.ncist.nbanewsclient.View.MFragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.weavey.loading.lib.LoadingLayout;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.controller.GameAdapter;
import com.zhouqi.ncist.nbanewsclient.model.GameToday;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by z on 2017/1/6.
 */

public class FragmentGame extends Fragment {

    private ListView mLv_game;
    private LoadingLayout mLoading;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_game,container,false);
        mLoading = (LoadingLayout) view.findViewById(R.id.loading);
        mLv_game = (ListView) view.findViewById(R.id.lv_game);
        initView();
        return view;
    }

    private void initView() {
//        mLoading.setStatus(LoadingLayout.No_Network);
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request  =new Request.Builder().url("http://v.juhe.cn/nba/schedule_byDate.php?date=2016-01-20&key=61101cc716ee139aadb06ba710d6fa1e").build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                  Log.i("Drew","ssssss");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result  = response.body().string();
                  Log.i("Drew","aaa"+result);
                Gson gson = new Gson();
                GameToday gameToday = gson.fromJson(result, GameToday.class);
                Message message = mHandler.obtainMessage();
                message.obj = gameToday;
                mHandler.sendMessage(message);
            }
        });

    }

    private Handler  mHandler  = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
             GameToday today = (GameToday) msg.obj;
            GameAdapter adapter = new GameAdapter(getActivity());
            adapter.setList(today.getResult());
            mLv_game.setAdapter(adapter);
        }
    };

}
