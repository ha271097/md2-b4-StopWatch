package com.company;

public class StopWatch {
    private double starTime;
    private double endTime;
    public StopWatch(){
    }
    public void startTime(){
        this.starTime = System.currentTimeMillis();
    }
    public void endTime(){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapesdTime(){
        return  (endTime - starTime)/1000;
    }

}
