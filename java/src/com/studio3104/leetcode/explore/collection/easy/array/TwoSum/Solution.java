package com.studio3104.leetcode.explore.collection.easy.array.TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsHashMap = new HashMap<>();

        int index = 0;
        for (int num: nums) {
            numsHashMap.put(num, index);
            index++;
        }

        index = 0;
        for (int num: nums) {
            int sub = target - num;
            if (numsHashMap.containsKey(sub) && index != numsHashMap.get(sub)) {
                return new int[]{index, numsHashMap.get(sub)};
            }
            index++;
        }

        return new int[]{};
    }
}
