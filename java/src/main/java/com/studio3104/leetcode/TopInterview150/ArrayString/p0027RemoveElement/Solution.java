package com.studio3104.leetcode.TopInterview150.ArrayString.p0027RemoveElement;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        List<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == val) {
                --count;
            } else {
                indexes.add(i);
            }
        }

        int p = 0;
        for (int i : indexes) {
            nums[p++] = nums[i];
        }

        return count;
    }
}
