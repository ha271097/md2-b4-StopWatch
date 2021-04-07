package com.company;

import java.util.Arrays;

public class demoTime {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.startTime();
        int [] array = new int [100000];
        int i = 0;
        while(i < array.length ){
            array[i] = (int) (Math.random()*1000);
            i++;
        }
        Arrays.sort(array);
        for (int a: array
             ) {
            System.out.println(a);
        }
        time.endTime();
        System.out.println(time.getElapesdTime());
    }
}
