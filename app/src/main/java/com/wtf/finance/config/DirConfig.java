package com.wtf.finance.config;

import android.os.Environment;

/**
 * description 存储路径配置
 */
public class DirConfig {

    /**
     * 请求数据缓存
     */
    public static final String HTTP_CACHE = Environment.getExternalStorageDirectory().getAbsolutePath() + "/httpCache";

}