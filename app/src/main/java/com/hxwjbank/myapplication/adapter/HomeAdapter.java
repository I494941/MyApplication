package com.hxwjbank.myapplication.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hxwjbank.myapplication.R;
import com.hxwjbank.myapplication.bean.InformationBody;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wangshuai on 2017/3/21.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHoder> {

    private List<InformationBody.ResultBean.ItemsBean> mDatas;
    private Activity mActivity;
    private LayoutInflater mLayoutInflater;

    public HomeAdapter(List<InformationBody.ResultBean.ItemsBean> datas, Activity activity) {
        mDatas = datas;
        mActivity = activity;
        mLayoutInflater = LayoutInflater.from(activity);
    }

    @Override
    public ViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_home_news, parent, false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(ViewHoder holder, int position) {
        InformationBody.ResultBean.ItemsBean itemsBean = mDatas.get(position);
        holder.mLlTextview.setText(itemsBean.getTitle());
        holder.mTvDescription.setText(itemsBean.getBody());
        holder.mTvTime.setText(itemsBean.getPubDate());
        holder.mTvCommentCount.setText(itemsBean.getCommentCount()+"");
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {

        @BindView(R.id.ll_textview)
        TextView mLlTextview;
        @BindView(R.id.tv_description)
        TextView mTvDescription;
        @BindView(R.id.tv_time)
        TextView mTvTime;
        @BindView(R.id.iv_info_comment)
        ImageView mIvInfoComment;
        @BindView(R.id.tv_comment_count)
        TextView mTvCommentCount;

        public ViewHoder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
