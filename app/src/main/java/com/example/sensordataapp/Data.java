package com.example.sensordataapp;

public class Data {
    //string variable for storing Accelerometer
    private String textView5;
    //string variable for storing Gyroscope
    private String textView3;

    //string variable for storing GPS
    private String gps;

    //empty constructer required when using Firebase Realtime Database.
    public Data() {

    }
    public String getTextView5() {
        return textView5;
    }
    public void setTextView5(String textView5) {
        this.textView5 = textView5;
    }
    public String getTextView3() {
        return textView3;
    }
    public void setTextView3(String textView3) {
        this.textView3 = textView3;
    }
    public String getGps() {
        return gps;
    }
    public void setGps(String gps) {
        this.gps = gps;
    }

}
