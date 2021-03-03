package com.studio3104.leetcode.explore.challenge.y2021.March.day02;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = IntStream.rangeClosed(1, nums.length).boxed().collect(Collectors.toSet());
        int duplicateNum = -1;

        for (int n : nums) {
            if (!set.contains(n)) {
                duplicateNum = n;
            }
            set.remove(n);
        }

        return new int[]{duplicateNum, set.stream().min(Comparator.comparingInt(a -> a)).orElse(-1)};
    }
}
