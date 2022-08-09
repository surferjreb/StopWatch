/**
 * A timer that can be used to determine the runtime of a program or a part of a program
 * By: James R. Brown
 * Date: 08/06/2022
 */


package com.brownj.stopwatch;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoField.MILLI_OF_DAY;

public class StopWatch {

    private static LocalTime startTime;
    private static LocalTime endTime;
    private static long completionTime;
    private static List<Double> laps;

    public static void startTimer() {
        startTime = LocalTime.now();
    }

    public static LocalTime getStartTime() {
        if (startTime != null) {
            return startTime;
        }

        return null;
    }

    public static void endTimer() {
        endTime = LocalTime.now();
        if (startTime != null) {
            completionTime = endTime.getLong(MILLI_OF_DAY) - startTime.getLong(MILLI_OF_DAY);
        } else {
            throw new NullPointerException("Did not start timer");
        }
    }

    public static LocalTime getEndTime() {
        if (endTime != null) {
            return endTime;
        }

        return null;
    }

    public static long getCompletionTimeRaw() {
        // returns value in milliseconds
        return completionTime;
    }

    public static double getCompletionTime() {
        // returns the time in seconds.
        double temp = 0;
        if (completionTime != 0) {
            temp = completionTime / 1000.00;
        }
        return temp;
    }

    public static void startStopWatch() {
        if (laps == null) {
            laps = new ArrayList<>();
        }
        startTimer();
    }

    public static void lap() {
        // Stops timer, gets difference, saves lap to List
        double temp = 0;
        if (laps != null) {
            endTimer();
            temp = getCompletionTime();
            laps.add(temp);
            startTimer();
        } else {
            throw new NullPointerException("Did not start stopwatch...");
        }
    }

    public static List<Double> stopStopWatch() {
        // Stops the stopwatch and returns the list of times in seconds.
        if (laps != null) {
            return new ArrayList<>(laps);
        } else {
            throw new NullPointerException("Did not start stop watch...");
        }
    }

    public static void resetStopWatch() {
        if (laps != null) {
            laps.clear();
        } else {
            throw new NullPointerException("Did not start stop watch");
        }

    }

    public static void resetTimer() {
        // used to reset single use timer
        startTime = null;
        endTime = null;
        completionTime = 0;
    }

}
