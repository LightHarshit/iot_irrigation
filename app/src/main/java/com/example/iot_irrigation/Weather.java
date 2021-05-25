package com.example.iot_irrigation;

public class Weather {
    String weather_type;
    Float min_temp;
    Float max_temp;
    Float humidity;

    public Weather(String weather_type,Float max_temp,Float min_temp,Float humidity){
        this.weather_type = weather_type;
        this.min_temp = min_temp;
        this.max_temp = max_temp;
        this.humidity = humidity;
    }
}
