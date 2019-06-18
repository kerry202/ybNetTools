package com.wtf.finance.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.wtf.finance.basemvp.basepresenter.BasePresenter;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();

        //页面销毁时取消presenter绑定
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

}
