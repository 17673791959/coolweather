package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.gson
 * @ClassName: Now
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/10 16:58
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
