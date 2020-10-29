package com.studio3104.leetcode.explore.challenge.October.day29;

import java.util.Arrays;

class Solution {
    public int maxDistToClosest(int[] seats) {
        int[] distance = new int[seats.length];

        int currentDistance = 0;
        boolean someoneAppeared = false;

        for (int i = 0; i < seats.length; ++i) {
            if (seats[i] == 0 && someoneAppeared) {
                distance[i] = ++currentDistance;
            }
            if (seats[i] == 1) {
                currentDistance = 0;
                someoneAppeared = true;
            }
        }

        currentDistance = 0;
        someoneAppeared = false;

        for (int i = seats.length - 1; i >= 0; --i) {
            if (seats[i] == 0 && someoneAppeared) {
                int cD = ++currentDistance;
                distance[i] = distance[i] == 0 ? cD : Math.min(distance[i], cD);
            }
            if (seats[i] == 1) {
                currentDistance = 0;
                someoneAppeared = true;
            }
        }

        return Arrays.stream(distance).max().orElse(0);
    }
}
