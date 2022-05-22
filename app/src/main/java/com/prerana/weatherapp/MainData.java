package com.prerana.weatherapp;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MainData {

    private Double temperature;
    private String pressure;

    @SerializedName("temp")

    public Double getTemperature() {
        return temperature;
    }
    @SerializedName("pressure")

    public String getPressure() {
        return pressure;
    }
}
