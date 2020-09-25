package com.studio3104.leetcode.explore.challenge.September.day25;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> sort(List<String> nums) {
        int len = nums.size();
        if (len <= 1) return nums;

        int pIndex = len / 2;
        String pivot = nums.get(pIndex);
        List<String> larger = new ArrayList<>();
        List<String> smaller = new ArrayList<>();

        for (int i = 0; i < len; ++i) {
            if (i == pIndex) continue;

            String num = nums.get(i);
            if ((pivot + num).compareTo(num + pivot) > 0) smaller.add(num);
            else larger.add(num);
        }

        larger = sort(larger);
        smaller = sort(smaller);

        larger.add(pivot); larger.addAll(smaller);
        return larger;
    }

    public String largestNumber(int[] nums) {
        List<String> stringNums = new ArrayList<>();
        for (int n: nums) stringNums.add(String.valueOf(n));
        List<String> sortedStringNums = sort(stringNums);

        if (sortedStringNums.get(0).equals("0")) return "0";

        StringBuilder result = new StringBuilder();
        for (String s: sortedStringNums) result.append(s);
        return result.toString();
    }
}
