package com.coolweather.android.gson;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.gson
 * @ClassName: AQI
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/10 16:57
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
