package com.example.ZhouChujin_020.coolweather.gson;

/**
 * Created by 22901 on 2018/1/5.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
