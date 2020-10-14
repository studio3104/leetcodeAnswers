package com.studio3104.leetcode.Problems.p0273IntegerToEnglishWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final String[] ranks = new String[]{"", "Thousand", "Million", "Billion"};
    private final String[] stringNumsU19 = new String[]{
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
    };
    private final String[] stringNumsU99 = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private void appendNumberWords(int num, int rankIndex, List<String> result) {
        if (num == 0) return;

        int hundred = num / 100;
        if (hundred > 0) {
            result.add(stringNumsU19[hundred]);
            result.add("Hundred");
        }
        num %= 100;
        if (num <= 19) result.add(stringNumsU19[num]);
        else {
            int ten = num / 10;
            result.add(stringNumsU99[ten]);
            result.add(stringNumsU19[num % 10]);
        }
        result.add(ranks[rankIndex]);
    }

    public String numberToWords(int num) {
        if (num == 0) return "Zero";

        List<String> result = new ArrayList<>();
        int rankIndex = 3;

        for (int k = 1_000_000_000; k > 0; k /= 1_000) {
            appendNumberWords(num / k, rankIndex--, result);
            num %= k;
        }

        StringBuilder sb = new StringBuilder();
        for (String s: result) if (!s.equals("")) sb.append(s).append(" ");

        return sb.toString().strip();
    }
}
