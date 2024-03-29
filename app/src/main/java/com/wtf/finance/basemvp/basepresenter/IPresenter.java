package com.wtf.finance.basemvp.basepresenter;

import com.wtf.finance.basemvp.baseview.IView;

import rx.Observable;
import rx.Subscriber;


public interface IPresenter<V extends IView> {
    /**
     * 关联
     * @param v
     */
    void attachView(V v);

    /**
     * 取消关联
     */
    void detachView();

    /**
     * Rx订阅
     */
    void subscribe(Observable observable, Subscriber subscriber);

    /**
     * Rx取消订阅
     */
    void unSubscribe();

}
