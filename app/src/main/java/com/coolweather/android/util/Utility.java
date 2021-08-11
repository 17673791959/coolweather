package com.coolweather.android.util;

import android.text.TextUtils;
import android.webkit.WebView;

import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;
import com.coolweather.android.gson.Weather;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @ProjectName: CoolWeather
 * @Package: com.coolweather.android.util
 * @ClassName: Utility
 * @Description: (描述) 由于服务器返回的省市县数据都是JSON格式的，提供一个类来解析和处理这种数据
 * @Author: 笑一笑
 * @CreateDate: 2021/8/9 14:52
 */
public class Utility {

    /**
     * @method handleProvinceResponse
     * @description (描述) 解析和处理服务器返回的省级数据
     * @date: 2021/8/9 14:54
     * @author: 笑一笑
     */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    /**
     * @method handleCityResponse
     * @description (描述) 解析和处理服务器返回的市级数据
     * @date: 2021/8/9 14:59
     * @author: 笑一笑
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {

            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * @method handleCountyResponse
     * @description (描述) 解析和处理服务器返回的县级数据
     * @date: 2021/8/9 15:04
     * @author: 笑一笑
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


     /**
      * @method  handleWeatherResponse
      * @description (描述) 将返回的JSON数据解析成Weather实体类
      * @date:   2021/8/10 17:39
      * @author: 笑一笑
      */
    public static Weather handleWeatherResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("HeWeather");
            String weatherContent = jsonArray.getJSONObject(0).toString();
            return new Gson().fromJson(weatherContent, Weather.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
