package com.hxwjbank.myapplication.ui.fragment;

import com.hxwjbank.myapplication.api.ApiManager;
import com.hxwjbank.myapplication.api.BaseCallBack;
import com.hxwjbank.myapplication.bean.InformationBody;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/3/21 0021.
 */

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mView;

    public HomePresenter(HomeContract.View view) {
        mView = view;
        view.setPresenter(this);
    }

    @Override
    public void getData() {
        ApiManager.getInstance().call("news?", new HashMap<String, String>(), ApiManager.RequestType.GET, new BaseCallBack<InformationBody>() {
            @Override
            protected void onFailure(Call call, Throwable e) {

            }

            @Override
            protected void onSuccess(Response response, InformationBody informationBody) {
                mView.setData(informationBody.getResult().getItems());
            }

            @Override
            protected void onError(Response response, int code, Exception e) {

            }
        });
    }
}
