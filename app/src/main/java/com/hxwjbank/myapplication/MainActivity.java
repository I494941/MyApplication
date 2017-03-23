package com.hxwjbank.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.hxwjbank.myapplication.ui.fragment.DealFragment;
import com.hxwjbank.myapplication.ui.fragment.HomeFragment;
import com.hxwjbank.myapplication.ui.fragment.MyFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {


    @BindView(R.id.title)
    TextView mTitle;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.tabs)
    FrameLayout mTabs;
    @BindView(R.id.bottom_bar)
    BottomNavigationBar mBottomBar;
    private ArrayList<Fragment> mFragments;
    private Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);

        getSupportActionBar().setTitle("");
        setSupportActionBar(mToolbar);

        mBottomBar.setMode(BottomNavigationBar.MODE_FIXED);
        mBottomBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);

        mBottomBar.addItem(new BottomNavigationItem(R.mipmap.home, "首页").setActiveColor(getResources().getColor(android.R.color.background_dark)))
                .addItem(new BottomNavigationItem(R.mipmap.ic_comment, "交易").setActiveColor(getResources().getColor(android.R.color.holo_red_dark)))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "我的").setActiveColor(getResources().getColor(android.R.color.holo_blue_dark)))
                .setFirstSelectedPosition(0).initialise();

        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new DealFragment());
        mFragments.add(new MyFragment());

        setDefaultFragment();

        mBottomBar.setTabSelectedListener(this);
    }

    private void setDefaultFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.tabs, mFragments.get(0));
        transaction.commit();
    }

    @Override
    public void onTabSelected(int position) {
        if (mFragments != null) {
            if (position < mFragments.size()) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Fragment fragment = mFragments.get(position);
                ft.replace(R.id.tabs, fragment);
                ft.commit();
            }
        }
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
