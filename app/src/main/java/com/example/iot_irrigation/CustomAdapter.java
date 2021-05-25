package com.example.iot_irrigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    List<Weather> list;
    TextView weather_type,temp_max,temp_min,humidity;

    public CustomAdapter(List<Weather> list){
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_row_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        weather_type.setText(list.get(position).weather_type);
        temp_max.setText(list.get(position).max_temp.toString());
        temp_min.setText(list.get(position).min_temp.toString());
        humidity.setText(list.get(position).humidity.toString());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            weather_type = itemView.findViewById(R.id.weather_type);
            temp_max = itemView.findViewById(R.id.temp_max);
            temp_min = itemView.findViewById(R.id.temp_min);
            humidity = itemView.findViewById(R.id.humidity);
        }
    }

}
