package com.coolweather.android.gson;

/**
 * Created by liangbicheng on 2017/5/10.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
