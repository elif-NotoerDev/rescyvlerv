package com.example.customlist;


public class Vehicle {
    private int imgUrl;
    private String vehicleType;
    private String currentKilometers;
    private String totalPrice;
    private String time;

    public Vehicle() {
        this.imgUrl=1;
    }

    public Vehicle(String imgUrl, String vehicleType, String currentKilometers, String totalPrice, String time) {
        this.imgUrl = 1;
        this.vehicleType = vehicleType;
        this.currentKilometers = currentKilometers;
        this.totalPrice = totalPrice;
        this.time = time;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCurrentKilometers() {
        return currentKilometers;
    }

    public void setCurrentKilometers(String currentKilometers) {
        this.currentKilometers = currentKilometers;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
