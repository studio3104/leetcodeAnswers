package com.studio3104.leetcode.explore.challenge.December.day27;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int minJumps(int[] arr) {
        Map<Integer, Set<Integer>> indexesOf = new HashMap<>();

        for (int i = 0; i < arr.length; ++i) {
            int n = arr[i];
            indexesOf.putIfAbsent(n, new HashSet<>());
            indexesOf.get(n).add(i);
        }

        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});

        int[] result = new int[arr.length];
        Arrays.fill(result, Integer.MAX_VALUE);

        while (!q.isEmpty()) {
            int[] t = q.poll();
            int index = t[0];
            int times = t[1];

            if (index < 0 || index >= arr.length || result[index] <= times) {
                continue;
            }
            result[index] = times;

            q.add(new int[]{index - 1, times + 1});
            q.add(new int[]{index + 1, times + 1});

            for (int i : indexesOf.get(arr[index])) {
                if (i != index) {
                    q.add(new int[]{i, times + 1});
                }
            }
        }

        return result[result.length - 1];
    }
}
