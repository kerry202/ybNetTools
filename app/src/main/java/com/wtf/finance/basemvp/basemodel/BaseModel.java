package com.wtf.finance.basemvp.basemodel;



import com.wtf.finance.config.ApiConfig;

import java.io.Serializable;

public class BaseModel<T> implements IModel, Serializable {

    public String code;
    public String bizcode;
    public String msg;
    public T data;

    public boolean isOk() {
        return bizcode.equals(ApiConfig.BIZCODE_OK);
    }
}
