package com.studio3104.leetcode.explore.challenge.y2020.August.week01;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    final int INTERVAL = 10;
    Map<String, Integer> lastTimestamp;

    /** Initialize your data structure here. */
    public Logger() {
        lastTimestamp = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (timestamp < lastTimestamp.getOrDefault(message, Integer.MIN_VALUE) + INTERVAL) return false;
        lastTimestamp.put(message, timestamp);
        return true;
    }
}

/*
  Your Logger object will be instantiated and called as such:
  Logger obj = new Logger();
  boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
