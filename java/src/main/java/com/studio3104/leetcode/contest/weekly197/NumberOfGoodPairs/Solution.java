package com.studio3104.leetcode.contest.weekly197.NumberOfGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> memo = new HashMap<>();
        int answer = 0;
        
        for (int num : nums) {
            if (memo.containsKey(num)) answer += memo.get(num);
            memo.put(num, memo.getOrDefault(num, 0) + 1);
        }

        return answer;
    }
}
