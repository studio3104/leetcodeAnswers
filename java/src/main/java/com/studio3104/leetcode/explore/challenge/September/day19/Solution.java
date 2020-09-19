package com.studio3104.leetcode.explore.challenge.September.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowLog10 = (int) Math.log10(low);
        int highLog10 = (int) Math.log10(high);

        List<Integer> answer = new ArrayList<>();

        for (int digits = lowLog10; digits <= highLog10; ++digits) {
            for (int i = 1; i <= 9 - digits; ++i) {
                int d = digits, c = 0, num = i;
                while (d >= 0) c += num++ * Math.pow(10, d--);
                if (c >= low && c <= high) answer.add(c);
            }
        }

        return answer;
    }
}
