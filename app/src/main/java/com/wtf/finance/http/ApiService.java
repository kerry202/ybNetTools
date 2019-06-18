package com.wtf.finance.http;


import com.wtf.finance.basemvp.basemodel.BaseModel;
import com.wtf.finance.config.ApiConfig;

import java.util.HashMap;

import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;
import rx.Observer;

import static com.wtf.finance.config.ApiConfig.isDebug;

/**
 * description Retrofit interface
 */
public interface ApiService {

    /** *******************************************  IP - config  ******************************************** */

    /** release service  */
    String SERVER_ADDRESS_RELEASE = ApiConfig.Base_Url;
    /**  text service  */
    String SERVER_ADDRESS_DEBUG = ApiConfig.Base_Url;

    /**  服务器域名 */
    String SERVER_ADDRESS = isDebug ? SERVER_ADDRESS_DEBUG : SERVER_ADDRESS_RELEASE;

    @GET(ApiConfig.SendSms)
    Observable<BaseModel<String>> getData();

    @FormUrlEncoded
    @POST(ApiConfig.SendSms)
    Observer<String> sendSmd(@Field("mobile")String phone,@Field("type")String type);

    @FormUrlEncoded
    @POST(ApiConfig.SendSms)
    Observable<String> getPost(@FieldMap HashMap<String, String> fields);

    @FormUrlEncoded
    @PUT(ApiConfig.SendSms)
    Observable<String> getPut(@FieldMap HashMap<String, String> fields);


}
