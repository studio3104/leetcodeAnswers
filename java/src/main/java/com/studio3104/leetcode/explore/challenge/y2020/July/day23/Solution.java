package com.studio3104.leetcode.explore.challenge.y2020.July.day23;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> c = new HashSet<>();
        for (int num: nums) {
            if (c.contains(num)) c.remove(num);
            else c.add(num);
        }
        return c.stream().mapToInt(i -> i).toArray();
    }
}
