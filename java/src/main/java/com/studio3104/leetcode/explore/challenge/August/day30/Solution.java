package com.studio3104.leetcode.explore.challenge.August.day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    List<Integer> primeNumbers;
    Map<Integer, Set<Integer>> graph;

    List<Integer> getPrimeNumbers(int maxNumber) {
        boolean[] targetNumbers = new boolean[maxNumber + 1];
        Arrays.fill(targetNumbers, true);
        targetNumbers[0] = false;
        targetNumbers[1] = false;

        List<Integer> primeNumbers = new ArrayList<>();

        int sqrt = (int) Math.sqrt(maxNumber);
        for(int i = 2; i <= sqrt; ++i) {
            if (targetNumbers[i]) {
                for (int j = (int) Math.pow(i, 2); j < targetNumbers.length; j += i) {
                    targetNumbers[j] = false;
                }
            }
        }

        for (int i = 2; i < targetNumbers.length; i++) {
            if (targetNumbers[i]) primeNumbers.add(i);
        }

        return primeNumbers;
    }

    int countConnectedComponents(int n, int count, Set<Integer> visited) {
        if (visited.contains(n)) return count;
        visited.add(n);
        ++count;

        for (int e: graph.get(n)) count = Math.max(count, countConnectedComponents(e, count, visited));
        return count;
    }

    public int largestComponentSize(int[] A) {
        int maxElement = 0;
        for (int n: A) maxElement = Math.max(maxElement, n);
        primeNumbers = getPrimeNumbers(maxElement / 2 + 1);

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int n: A) {
            for (int p: primeNumbers) {
                if (n < p) break;
                if (n % p == 0) {
                    groups.putIfAbsent(p, new ArrayList<>());
                    groups.get(p).add(n);
                }
            }
        }

        graph = new HashMap<>();
        for (List<Integer> nums: groups.values()) {
            for (int n: nums) {
                graph.putIfAbsent(n, new HashSet<>());
                graph.get(n).addAll(nums);
                graph.get(n).remove(n);
            }
        }

        int maxSize = 0;
        Set<Integer> visited = new HashSet<>();
        for (int n: graph.keySet()) maxSize = Math.max(maxSize, countConnectedComponents(n, 0, visited));

        return maxSize;
    }
}
