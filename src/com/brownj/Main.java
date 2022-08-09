package com.brownj;

import com.brownj.stopwatch.StopWatch;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Timer timer = new Timer();
        System.out.println("So stuff will happen");
        StopWatch.startStopWatch();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        StopWatch.lap();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        StopWatch.lap();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        StopWatch.lap();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        StopWatch.lap();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        StopWatch.lap();
        List<Double> times = StopWatch.stopStopWatch();
        for (double compTime : times) {
            System.out.printf("%d: \t%.3f sec\n", times.indexOf(compTime), compTime);
        }

    }
}
