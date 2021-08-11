package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.gson
 * @ClassName: Basic
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/10 16:53
 */
public class Basic {

    //由于JSON中的一些字段可能不太适合直接作为Java字段名来命名，因此这里直接使用了@SerializedName注解的方式，来让JSON字段和Java中间建立映射关系
    @SerializedName("city")
    public String cityName;         //城市名

    @SerializedName("id")
    public String weatherId;        //天气id

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
