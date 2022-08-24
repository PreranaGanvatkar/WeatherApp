package com.prerana.weatherapp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MainData {

    @SerializedName("temp")
    private Double temperature;
    @SerializedName("pressure")
    private String pressure;


    public Double getTemperature() {
        return temperature;
    }


    public String getPressure() {
        return pressure;
    }
}
