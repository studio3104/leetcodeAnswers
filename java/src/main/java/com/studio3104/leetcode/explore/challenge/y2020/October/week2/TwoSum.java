package com.studio3104.leetcode.explore.challenge.y2020.October.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class TwoSum {
    List<Integer> nums;
    Map<Integer, Integer> indexes;
    Set<Integer> cache;

    public TwoSum() {
        nums = new ArrayList<>();
        indexes = new HashMap<>();
        cache = new HashSet<>();
    }

    public void add(int number) {
        indexes.put(number, nums.size());
        nums.add(number);
    }

    public boolean find(int value) {
        if (cache.contains(value)) return true;

        for (int i = 0; i < nums.size(); ++i) {
            int sub = value - nums.get(i);
            if (indexes.containsKey(sub) && indexes.get(sub) != i) {
                cache.add(value);
                return true;
            }
        }

        return false;
    }
}
