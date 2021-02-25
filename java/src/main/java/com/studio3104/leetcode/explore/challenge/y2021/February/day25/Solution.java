package com.studio3104.leetcode.explore.challenge.y2021.February.day25;

import java.util.Arrays;

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] numsClone = nums.clone();
        Arrays.sort(numsClone);

        int head = nums.length, tail = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == numsClone[i]) {
                continue;
            }

            head = Math.min(head, i);
            tail = Math.max(tail, i);
        }

        int sub = tail - head;
        return sub >= 0 ? sub + 1 : 0;
    }
}
