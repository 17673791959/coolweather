package com.coolweather.android.util;

import android.util.Log;

import com.coolweather.android.R;

import java.net.InetAddress;
import java.net.UnknownHostException;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.util
 * @ClassName: HttpUtil
 * @Description: (描述) 对口OkHttp封装，封装一个HTTP请求方法
 * @Author: 笑一笑
 * @CreateDate: 2021/8/9 14:44
 */
public class HttpUtil {
    
     /**
      * @method  sendOkHttpRequest
      * @description (描述) 传入请求地址，调用一个回调来处理服务器响应就可以了
      * @date:   2021/8/9 14:51
      * @author: 笑一笑
      */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
        Log.d("TAG", "sendOkHttpRequest: "+address);

    }
}
