package com.studio3104.leetcode.explore.challenge.y2020.August.day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    Map<Integer, List<Integer>> pairs;

    void setPairs(int diff) {
        pairs = new HashMap<>();
        for (int i = 0; i <= 9; ++i) {
            List<Integer> pair = new ArrayList<>();
            if (i + diff <= 9) pair.add(i + diff);
            if (i - diff >= 0) pair.add(i - diff);
            if (!pair.isEmpty()) pairs.put(i, pair);
        }
    }

    List<Integer> traversePairs(int num, int digits, List<Integer> nums) {
        if (digits <= 0) return nums;
        List<Integer> result = new ArrayList<>();
        for (int next: pairs.get(num)) {
            List<Integer> currentNums = new ArrayList<>();
            for (int n: nums) currentNums.add(n * 10 + next);
            result.addAll(traversePairs(next, digits - 1, currentNums));
        }
        return result;
    }

    public int[] numsSameConsecDiff(int N, int K) {
        if (N == 1) return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        setPairs(K);
        Set<Integer> answer = new HashSet<>();
        for (int k: pairs.keySet()) {
            List<Integer> temporaryNums = List.of(k);
            for (int n: traversePairs(k, N - 1, temporaryNums)) {
                if ((int) Math.log10(n) + 1 == N) answer.add(n);
            }
        }

        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numsSameConsecDiff(3, 7);
    }
}
