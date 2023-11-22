package com.studio3104.leetcode.TopInterview150.ArrayString.p0055JumpGame;

import java.util.HashSet;
import java.util.Set;

class Solution {
    boolean isDestination(int[] nums, int position, Set<Integer> explored) {
        if (position == nums.length - 1) {
            return true;
        }
        if (position < 0 || position >= nums.length) {
            return false;
        }
        if (explored.contains(position)) {
            return false;
        }
        explored.add(position);

        for (int step = nums[position]; step > 0; --step) {
            if (isDestination(nums, position + step, explored)) {
                return true;
            }
            if (isDestination(nums, position - step, explored)) {
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        Set<Integer> explored = new HashSet<>();
        return isDestination(nums, 0, explored);
    }
}
