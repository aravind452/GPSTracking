package com.aravind.gpstracking;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    private static MyApplication singleton;

    public List<Location> getMylocations() {
        return mylocations;
    }

    public void setMylocations(List<Location> mylocations) {
        this.mylocations = mylocations;
    }

    private List<Location>  mylocations;

    public MyApplication getInstance(){
        return singleton;
    }

    public void onCreate(){
        super.onCreate();
        singleton = this;
        mylocations = new ArrayList<>();
    }

}
