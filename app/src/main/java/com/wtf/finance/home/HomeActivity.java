package com.wtf.finance.home;


import android.os.Bundle;

import com.wtf.finance.R;
import com.wtf.finance.base.BaseActivity;
import com.wtf.finance.basemvp.basemodel.BaseModel;

public class HomeActivity extends BaseActivity<HomePresenter> implements MainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter.getData();

    }

    @Override
    protected HomePresenter createPresenter() {
        return new HomePresenter(this);
    }


    @Override
    public void getData(BaseModel<String> date) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
