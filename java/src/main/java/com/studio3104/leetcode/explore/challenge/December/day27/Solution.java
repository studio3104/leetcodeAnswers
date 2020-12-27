package com.studio3104.leetcode.explore.challenge.December.day27;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    private int[] compressArray(int[] arr) {
        if (arr.length <= 3) {
            return arr;
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(arr[0]);

        for (int i = 1; i < arr.length - 1; ++i) {
            int n = arr[i];
            if (n != arr[i - 1] || n != arr[i + 1]) {
                numbers.add(n);
            }
        }
        numbers.add(arr[arr.length - 1]);

        return numbers.stream().mapToInt(n -> n).toArray();
    }

    public int minJumps(int[] arr) {
        arr = compressArray(arr);
        Map<Integer, Set<Integer>> indexesOf = new HashMap<>();

        for (int i = 0; i < arr.length; ++i) {
            indexesOf.computeIfAbsent(arr[i], v -> new HashSet<>()).add(i);
        }

        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, 0});

        Set<Integer> processed = new HashSet<>();
        int result = -1;

        while (!q.isEmpty()) {
            int[] t = q.poll();
            int index = t[0];
            int times = t[1];

            if (index == arr.length - 1) {
                result = times;
                break;
            }

            if (processed.contains(index) || index < 0 || index >= arr.length) {
                continue;
            }
            processed.add(index);

            q.add(new int[]{index - 1, times + 1});
            q.add(new int[]{index + 1, times + 1});

            for (int i : indexesOf.get(arr[index])) {
                if (!processed.contains(i)) {
                    q.add(new int[]{i, times + 1});
                }
            }
        }

        return result;
    }
}
