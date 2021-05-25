package com.example.iot_irrigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class WeatherReoprt extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_reoprt);

        /*fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        RecyclerviewFragment recyclerviewFragment = new RecyclerviewFragment();
        fragmentTransaction.add(R.id.recyclerView_fragmentHolder,recyclerviewFragment,null).commit();*/

    }
}