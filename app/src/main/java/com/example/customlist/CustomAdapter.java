package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<Vehicle> mVehicleList;
    LayoutInflater inflater;
public CustomAdapter (Context context,ArrayList<Vehicle> vehicles){
        inflater=LayoutInflater.from(context);
        this.mVehicleList=vehicles;
}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Vehicle selectedVehicle = mVehicleList.get(position);

        holder.setData(selectedVehicle);
    }

    @Override
    public int getItemCount() {
        return mVehicleList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView vehicleName,kilometer,price,time;
    ImageView imageView;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        vehicleName=itemView.findViewById(R.id.textViewVehicleName);
        kilometer=itemView.findViewById(R.id.textViewKilometer);
        price=itemView.findViewById(R.id.textViewPrice);
        time=itemView.findViewById(R.id.textViewTime);
        imageView=itemView.findViewById(R.id.imageViewVehiclePicture);

    }


        public void setData(Vehicle selectedVehicle) {

        this.price.setText(selectedVehicle.getTotalPrice());
        this.kilometer.setText(selectedVehicle.getCurrentKilometers());
        this.vehicleName.setText(selectedVehicle.getVehicleType());
        this.time.setText(selectedVehicle.getTime());
        this.imageView.setImageResource(selectedVehicle.getImgUrl());
        }


    }




}
