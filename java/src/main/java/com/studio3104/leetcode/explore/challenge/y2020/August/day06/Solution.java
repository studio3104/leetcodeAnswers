package com.studio3104.leetcode.explore.challenge.y2020.August.day06;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int num: nums) nums[Math.abs(num) - 1] *= -1;
        for (int num: nums) {
            if (nums[Math.abs(num) - 1] <= 0) continue;
            duplicates.add(Math.abs(num));
            nums[Math.abs(num) - 1] *= -1;
        }

        return duplicates;
    }
}
