package com.studio3104.leetcode.explore.challenge.August.day25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    Map<Integer, Integer> memo = new HashMap<>();
    int lastDay;
    int[] costs;
    Set<Integer> daysSet;

    // dp(i) = min(dp(i+1) + costs[0], dp(i+7) + costs[1], dp(i+30) + costs[2])
    int DP(int day) {
        if (day > lastDay) return 0;
        if (memo.containsKey(day)) return memo.get(day);

        if (!daysSet.contains(day)) memo.put(day, DP(day + 1));
        else {
            int c = Math.min(DP(day + 1) + costs[0], DP(day + 7) + costs[1]);
            c = Math.min(c, DP(day + 30) + costs[2]);
            memo.put(day, c);
        }

        return memo.get(day);
    }

    public int mincostTickets(int[] days, int[] costs) {
        lastDay = days[days.length - 1];
        this.costs = costs;
        daysSet = Arrays.stream(days).boxed().collect(Collectors.toSet());
        return DP(1);
    }
}
