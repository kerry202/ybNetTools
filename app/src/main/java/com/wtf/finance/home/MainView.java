package com.wtf.finance.home;

import com.wtf.finance.basemvp.basemodel.BaseModel;
import com.wtf.finance.basemvp.baseview.IBaseView;

public interface MainView extends IBaseView {

    void getData(BaseModel<String> date);
}
