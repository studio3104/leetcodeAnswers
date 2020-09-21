package com.studio3104.leetcode.explore.challenge.September.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeSet<Integer> locations = new TreeSet<>();
        Map<Integer, Integer> onOff= new HashMap<>();

        for (int[] trip: trips) {
            locations.add(trip[1]);
            locations.add(trip[2]);
            onOff.put(trip[1], onOff.getOrDefault(trip[1], 0) + trip[0]);
            onOff.put(trip[2], onOff.getOrDefault(trip[2], 0) - trip[0]);
        }

        int passengers = 0;

        for (int location: locations) {
            passengers += onOff.get(location);
            if (passengers > capacity) return false;
        }

        return true;
    }
}
