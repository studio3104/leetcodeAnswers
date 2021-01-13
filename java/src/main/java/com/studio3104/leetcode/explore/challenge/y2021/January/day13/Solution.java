package com.studio3104.leetcode.explore.challenge.y2021.January.day13;

import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int head = 0;
        int tail = people.length - 1;

        int numBoats = 0;

        for (; head <= tail; ++numBoats) {
            if (people[head] + people[tail--] <= limit) {
                ++head;
            }
        }

        return numBoats;
    }
}
