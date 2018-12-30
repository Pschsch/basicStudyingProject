package com.maxonchik.studyingproj;

public class Lightning {
    private int speedInAir = 1100;
    private double echoTime;


    public int getSpeedInAir() {
        return speedInAir;
    }

    public void setTime(double Time) {
        echoTime = Time;
    }

    public double Distance() {
        return echoTime * speedInAir / 2; //видоизмененная программа для определния расстояния по времени прихода эхо


    }
}
