package com.zhouqi.ncist.nbanewsclient.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.zhouqi.ncist.nbanewsclient.R;
import com.zhouqi.ncist.nbanewsclient.model.GameToday;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 2017/1/20.
 */

public class GameAdapter extends BaseAdapter {
    Context mContext;

    public GameAdapter(Context context) {
        mContext = context;
    }

    private List<GameToday.ResultBean> mList = new ArrayList<>();

    public void setList(List<GameToday.ResultBean>list){
        mList= list;
    }
    public void updateAdapter(){
        notifyDataSetChanged();
    }

    /**
     * 添加数据
     * @param list
     */
    public void addList(List<GameToday.ResultBean>list){
        mList.addAll(list);
    }
    public void clearData(){
        mList.clear();
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder =null;
        if(convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_today_game,null);
            viewHolder = new ViewHolder();
            viewHolder.iv_home = (ImageView) convertView.findViewById(R.id.iv_team_home);
            viewHolder.iv_away = (ImageView) convertView.findViewById(R.id.iv_team_away);
            viewHolder.tv_game_type = (TextView) convertView.findViewById(R.id.tv_game_type);
            viewHolder.tv_game_time = (TextView) convertView.findViewById(R.id.tv_game_quarter);
            viewHolder.tv_home_score = (TextView) convertView.findViewById(R.id.tv_team_home_score);
            viewHolder.tv_away_score = (TextView) convertView.findViewById(R.id.tv_team_away_score);
            viewHolder.tv_home_name = (TextView) convertView.findViewById(R.id.tv_team_home_name);
            viewHolder.tv_away_name = (TextView) convertView.findViewById(R.id.tv_team_away_name);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv_game_type.setText(mList.get(position).getMatch_type());
        viewHolder.tv_home_name.setText(mList.get(position).getHome().getName());
        viewHolder.tv_away_name.setText(mList.get(position).getAway().getName());
        viewHolder.tv_home_score.setText(mList.get(position).getHome().getScore());
        viewHolder.tv_away_score.setText(mList.get(position).getAway().getScore());
        viewHolder.tv_game_time.setText(mList.get(position).getProcess());
        ImageLoader.getInstance().displayImage(mList.get(position).getHome().getLogo(),viewHolder.iv_home);
        ImageLoader.getInstance().displayImage(mList.get(position).getAway().getLogo(),viewHolder.iv_away);
        return convertView;
    }

    private  final static class ViewHolder{
        public TextView tv_game_type ,tv_game_time,tv_home_name,
                tv_away_name,tv_home_score,tv_away_score;
        public ImageView iv_home,iv_away;
    }
}
