package com.brownj.stopwatch;

import static org.junit.jupiter.api.Assertions.*;

class StopWatchTest {

    @org.junit.jupiter.api.Test
    void startTimerNotNull() {
        StopWatch.startTimer();
        assert (StopWatch.getStartTime() != null);
    }

    @org.junit.jupiter.api.Test
    void endTimerNotNull() {
        StopWatch.startTimer();
        StopWatch.endTimer();
        assert (StopWatch.getEndTime() != null);
    }

    @org.junit.jupiter.api.Test
    void getCompletionTimeRawNotNeg() {
        StopWatch.startTimer();
        StopWatch.endTimer();
        assert (StopWatch.getCompletionTimeRaw() >= 0);
    }

    @org.junit.jupiter.api.Test
    void getCompletionTime() {
        StopWatch.startTimer();
        StopWatch.endTimer();
        double time = StopWatch.getCompletionTime();
        assert (time >= 0);
    }

    @org.junit.jupiter.api.Test
    void startStopWatchStartsTime() {
        StopWatch.startStopWatch();
        assert (StopWatch.getStartTime() != null);
    }

    @org.junit.jupiter.api.Test
    void lap() {
        fail("Not implemented yet");
    }

    @org.junit.jupiter.api.Test
    void stopStopWatch() {
        fail("Not implemented yet");
    }

    @org.junit.jupiter.api.Test
    void resetStopWatch() {
        fail("Not implemented yet");
    }

    @org.junit.jupiter.api.Test
    void resetTimer() {
        StopWatch.resetTimer();
        assert (StopWatch.getCompletionTime() == 0);
    }
}