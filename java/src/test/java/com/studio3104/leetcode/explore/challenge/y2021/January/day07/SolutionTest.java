package com.studio3104.leetcode.explore.challenge.y2021.January.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            ", 0",
            "abba, 2",
            "dvdf, 3",
    })
    void lengthOfLongestSubstring(String s, int expected) {
        int actual = solution.lengthOfLongestSubstring(s == null ? "" : s);
        Assertions.assertEquals(expected, actual);
    }
}
