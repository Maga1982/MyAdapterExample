package com.example.harshu.myadaptereample;

public class Earthquake {
    int magnitude;
    String place;
    int time;
    Earthquake(int magnitude,String place,int time){
        this.magnitude=magnitude;
        this.place=place;
        this.time=time;
    }

    public int getMagnitude(){
        return magnitude;
    }
    public String getPlace(){
        return place;
    }
    public int getTime(){
        return time;
    }
}
