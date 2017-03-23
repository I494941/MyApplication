package com.hxwjbank.myapplication.ui.fragment;

import com.hxwjbank.myapplication.base.BasePresenter;
import com.hxwjbank.myapplication.base.BaseView;
import com.hxwjbank.myapplication.bean.InformationBody;

import java.util.List;

/**
 * Created by wangshuai on 2017/3/21 0021.
 */

public interface HomeContract {
    interface Presenter extends BasePresenter {}
    interface View extends BaseView<Presenter> {
        void setData(List<InformationBody.ResultBean.ItemsBean> itemsBean);
        void setError(String msg);
    }
}
