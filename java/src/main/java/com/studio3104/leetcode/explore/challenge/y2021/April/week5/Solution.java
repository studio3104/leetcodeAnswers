package com.studio3104.leetcode.explore.challenge.y2021.April.week5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Solution {
    private void appendSlots(int[][] slots, int duration, PriorityQueue<int[]> q) {
        q.addAll(
                Arrays.stream(slots)
                        .filter(s -> s[1] - s[0] >= duration)
                        .collect(Collectors.toList())
        );
    }

    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        PriorityQueue<int[]> slots = new PriorityQueue<>(Comparator.comparingInt(s -> s[0]));
        appendSlots(slots1, duration, slots);
        appendSlots(slots2, duration, slots);

        while (slots.size() > 1) {
            int[] s1 = slots.poll();
            int[] s2 = slots.peek();
            if (s1[1] >= Objects.requireNonNull(s2)[0] + duration) {
                return List.of(s2[0], s2[0] + duration);
            }
        }

        return List.of();
    }
}
