package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.StringToInteger;

public class Solution {
    public int myAtoi(String str) {
        if (str == null) return 0;
        str = str.trim();
        if (str.length() == 0) return 0;

        long answer = 0;
        boolean isPositive = true;
        int begin = 0;

        char firstChar = str.charAt(0);
        if (firstChar == '+' || firstChar == '-') begin = 1;
        if (firstChar == '-') isPositive = false;

        for (int i = begin; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) break;

            answer = answer * 10 + Character.getNumericValue(c);

            if (isPositive && answer > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (!isPositive && answer * -1 < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) answer * (isPositive ? 1 : -1);
    }
}
