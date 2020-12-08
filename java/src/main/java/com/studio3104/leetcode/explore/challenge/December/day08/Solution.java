package com.studio3104.leetcode.explore.challenge.December.day08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        Map<Integer, List<Integer>> indexOf = new HashMap<>();

        for (int i = 0; i < time.length; ++i) {
            int surplus = time[i] % 60;

            int sub = surplus == 0 ? 0 : 60 - surplus;

            if (indexOf.containsKey(sub)) {
                count += indexOf.get(sub).size();
            }

            indexOf.putIfAbsent(surplus, new ArrayList<>());
            indexOf.get(surplus).add(i);
        }

        return count;
    }
}
