package com.example.ZhouChujin_020.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 22901 on 2018/1/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
