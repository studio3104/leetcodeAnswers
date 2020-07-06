package com.studio3104.leetcode.explore.collection.easy.array.IntersectionOfTwoArraysII;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        Map<Integer, Integer> counter = new HashMap<>();
        for (int num1: nums1) {
            counter.put(num1, counter.getOrDefault(num1, 0) + 1);
        }

        int range = 0;
        for (int num2: nums2) {
            int count = counter.getOrDefault(num2, 0);
            if (count <= 0) continue;
            nums1[range++] = num2;
            counter.put(num2, --count);
        }

        return Arrays.copyOfRange(nums1, 0, range);
    }
}