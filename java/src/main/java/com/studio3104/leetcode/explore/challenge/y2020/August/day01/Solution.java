package com.studio3104.leetcode.explore.challenge.y2020.August.day01;

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;

        boolean isFirstUpper = Character.isUpperCase(word.charAt(0));
        boolean isSecondUpper = Character.isUpperCase(word.charAt(1));
        if (!isFirstUpper && isSecondUpper) return false;

        for (int i = 2; i < word.length(); ++i) {
            if (isFirstUpper && isSecondUpper && Character.isLowerCase(word.charAt(i))) return false;
            if (!isSecondUpper && Character.isUpperCase(word.charAt(i))) return false;
        }

        return true;
    }
}
