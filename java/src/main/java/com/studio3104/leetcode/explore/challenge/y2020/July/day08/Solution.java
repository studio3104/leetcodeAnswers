package com.studio3104.leetcode.explore.challenge.y2020.July.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    void twoSum(int[] nums, int i, List<List<Integer>> answer) {
        int n0 = nums[i], start = i + 1, end = nums.length - 1;

        while (start < end) {
            int n1 = nums[start], n2 = nums[end], sum = n0 + n1 + n2;

            if (sum < 0 || start > i + 1 && n1 == nums[start - 1]) { start++; }
            else if (sum > 0 || end < nums.length - 1 && n2 == nums[end + 1]) { end--; }
            else {
                answer.add(List.of(n0, n1, n2));
                start++; end--;
            }
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i == 0 || nums[i] != nums[i - 1]) twoSum(nums, i, answer);
        }

        return answer;
    }
}
