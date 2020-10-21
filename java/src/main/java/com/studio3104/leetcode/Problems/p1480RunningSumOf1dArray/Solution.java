package com.studio3104.leetcode.Problems.p1480RunningSumOf1dArray;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public int[] runningSum(int[] nums) {
        AtomicInteger sum = new AtomicInteger();

        return Arrays.stream(nums)
                .sequential()
                .map((n) -> {
                    sum.getAndAdd(n);
                    return sum.get();
                })
                .toArray();
    }
}
