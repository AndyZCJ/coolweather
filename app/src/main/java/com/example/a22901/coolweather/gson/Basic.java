package com.example.a22901.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 22901 on 2018/1/5.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
