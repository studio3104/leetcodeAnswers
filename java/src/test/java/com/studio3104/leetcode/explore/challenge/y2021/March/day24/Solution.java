package com.studio3104.leetcode.explore.challenge.y2021.March.day24;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        Map<Integer, Queue<Integer>> bIndexesOf = new HashMap<>();
        for (int i = 0; i < B.length; ++i) {
            int n = B[i];
            bIndexesOf.putIfAbsent(n, new ArrayDeque<>());
            bIndexesOf.get(n).add(i);
        }

        PriorityQueue<Integer> pqA = Arrays.stream(A).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        PriorityQueue<Integer> pqB = Arrays.stream(B).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        Queue<Integer> remains = new ArrayDeque<>();
        int[] result = new int[A.length];
        Arrays.fill(result, -1);

        while (!pqA.isEmpty()) {
            int a = pqA.poll();
            int b = pqB.peek();
            if (b >= a) {
                remains.add(a);
                continue;
            }
            int i = bIndexesOf.get(pqB.poll()).poll();
            result[i] = a;
        }

        for (int i = 0; i < result.length; ++i) {
            int n = result[i];
            if (n == -1) {
                result[i] = remains.poll();
            }
        }

        return result;
    }
}
