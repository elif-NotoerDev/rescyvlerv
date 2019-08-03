package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

   final ArrayList<Vehicle> vehicleList=new ArrayList<Vehicle>();
   RecyclerView recyclerView;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        vehicleList.add(new Vehicle("car","limuzim","356","1445","12"));
        vehicleList.add(new Vehicle("car","taxi","898","1445","12"));
        vehicleList.add(new Vehicle("car","electricCar","554","40","114"));
        vehicleList.add(new Vehicle("car","bike","55","1445","12"));
        vehicleList.add(new Vehicle("car","luxury","535","1445","12"));
        vehicleList.add(new Vehicle("car","fg","075","1445","12"));
        vehicleList.add(new Vehicle("car","lzim","133454","1445","12"));





        recyclerView =  findViewById(R.id.my_recycler_view);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),vehicleList);
        recyclerView.setAdapter(customAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);



    }


}
