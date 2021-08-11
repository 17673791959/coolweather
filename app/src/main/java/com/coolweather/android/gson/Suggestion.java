package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.gson
 * @ClassName: Suggestion
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/10 17:00
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
