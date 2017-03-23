package com.hxwjbank.myapplication.ui.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hxwjbank.myapplication.R;
import com.hxwjbank.myapplication.adapter.HomeAdapter;
import com.hxwjbank.myapplication.bean.InformationBody;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeContract.View {


    @BindView(R.id.rv)
    RecyclerView mRv;
    @BindView(R.id.srL_news)
    SwipeRefreshLayout mSrLNews;
    /*@BindView(R.id.tv)
    TextView tv;*/


    private List<InformationBody.ResultBean.ItemsBean> mDatas;
    private HomeAdapter mHomeAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        mDatas = new ArrayList<>();
        initView();

        new HomePresenter(this);
        presenter.getData();

        //设置刷新时动画的颜色，可以设置4个
        mSrLNews.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        mSrLNews.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {

            @Override
            public void onRefresh() {
                //tv.setText("正在刷新");
                // TODO Auto-generated method stub
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        //tv.setText("刷新完成");
                        mSrLNews.setRefreshing(false);
                    }
                }, 6000);

                //mSrLNews .setRefreshing(false);

            }
        });

        return view;
    }

    private void initView() {
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        mHomeAdapter = new HomeAdapter(mDatas, getActivity());
        mRv.setAdapter(mHomeAdapter);
    }

    @Override
    public void setData(List<InformationBody.ResultBean.ItemsBean> itemsBean) {
        mDatas.addAll(itemsBean);
        mHomeAdapter.notifyDataSetChanged();
    }

    @Override
    public void setError(String msg) {

    }

    HomeContract.Presenter presenter;

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
