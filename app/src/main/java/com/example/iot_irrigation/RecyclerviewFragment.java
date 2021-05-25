package com.example.iot_irrigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerviewFragment extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView recyclerView;
    CustomAdapter customAdapter;
    List<Weather> list;

    public RecyclerviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        /*weather = new Weather[7];
        weather[0].setWeather("Cloucy",38f,25f,53.0f);
        weather[1].setWeather("Haze",37f,26f,42.0f);
        weather[2].setWeather("Sunny",37.1f,25f,41.0f);
        weather[3].setWeather("Sunny",38f,24f,43.0f);
        weather[4].setWeather("Cloucy",39f,26f,50.0f);
        weather[5].setWeather("Cloucy",38f,26f,45.0f);
        weather[6].setWeather("Partly Cloudy",37f,25f,48.0f);*/
        list.add(new Weather("Cloucy",38f,25f,53.0f));
        list.add(new Weather("Haze",37f,26f,42.0f));
        list.add(new Weather("Sunny",37.1f,25f,41.0f));
        list.add(new Weather("Sunny",38f,24f,43.0f));
        list.add(new Weather("Cloucy",39f,26f,50.0f));
        list.add(new Weather("Cloucy",38f,26f,45.0f));
        list.add(new Weather("Partly Cloudy",37f,25f,48.0f));


        recyclerView = view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        customAdapter = new CustomAdapter(list);
        recyclerView.setAdapter(customAdapter);

        return view;
    }
}