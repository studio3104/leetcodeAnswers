package com.studio3104.leetcode.explore.challenge.y2020.July.day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int n: nums) counter.put(n, counter.getOrDefault(n, 0) + 1);
        counter = counter.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (key, value) -> key, LinkedHashMap::new));

        int[] elements = new int[k];
        int index = 0;
        for (int n: counter.keySet()) {
            if (k <= index) break;
            elements[index++] = n;
        }

        return elements;
    }
}
