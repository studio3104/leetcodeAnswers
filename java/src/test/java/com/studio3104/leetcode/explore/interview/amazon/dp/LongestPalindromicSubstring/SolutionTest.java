package com.studio3104.leetcode.explore.interview.amazon.dp.LongestPalindromicSubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "babad, bab", "cbbd, bb", "abacab, bacab",
            "a, a", "ac, a", "aa, aa", "abcda, a",
    })
    void longestPalindrome(String s, String expected) {
        String result = solution.longestPalindrome(s);
        Assertions.assertEquals(expected, result);
    }
}