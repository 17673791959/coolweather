package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.db
 * @ClassName: County
 * @Description: (描述)
 * @Author: 笑一笑
 * @CreateDate: 2021/8/9 14:25
 */
public class County extends DataSupport {

    private int id;

    private String countName;       //县名字

    private String weatherId;       //县对应的天气id

    private int cityId;             //当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
