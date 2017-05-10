package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/5/9.
 */

public class HttpUtil {

    public static void sendOkhttpRequest(String address,okhttp3.Callback callback){
        //创建okHttpClient对象
        OkHttpClient client=new OkHttpClient();
        //创建一个Request
        Request request=new Request.Builder().url(address).build();
        //请求将call加入调度队列
        client.newCall(request).enqueue(callback);
    }
}
