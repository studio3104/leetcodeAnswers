package com.studio3104.leetcode.Problems.p1086HighFive;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[][] highFive(int[][] items) {
        int capacity = 5;
        Map<Integer, PriorityQueue<Integer>> topFiveOf = new HashMap<>();

        for (int[] item: items) {
            int id = item[0], score = item[1];
            topFiveOf.putIfAbsent(id, new PriorityQueue<>(capacity));
            PriorityQueue<Integer> scores = topFiveOf.get(id);
            scores.add(score);
            while (scores.size() > capacity) scores.poll();
        }

        return topFiveOf.entrySet()
                .stream()
                .map((e) -> {
                    int scoreSum = e.getValue().stream().mapToInt(i -> i).sum();
                    return new int[]{e.getKey(), scoreSum / capacity};
                })
                .toArray(int[][]::new);
    }
}
