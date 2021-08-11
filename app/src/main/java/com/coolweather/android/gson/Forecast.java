package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.gson
 * @ClassName: Forecast
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/10 17:04
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
