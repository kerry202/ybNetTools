package com.wtf.finance.home;

import com.wtf.finance.basemvp.basemodel.BaseModel;
import com.wtf.finance.basemvp.basepresenter.BasePresenter;
import com.wtf.finance.http.ApiCallBack;

public class HomePresenter extends BasePresenter<MainView> {

    public HomePresenter(MainView mainView) {
        attachView(mainView);
    }

    public void getData() {

        subscribe(apiService.getData(), new ApiCallBack<BaseModel<String>>() {
            @Override
            public void onSuccess(BaseModel<String> videoBeanBaseModel) {
                mView.getData(videoBeanBaseModel);
            }
        });
    }

}
