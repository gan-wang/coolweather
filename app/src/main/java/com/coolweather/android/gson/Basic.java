package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wang on 2017/4/25 0025.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
