package com.studio3104.leetcode.explore.challenge.November.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "aaabb, 3, 3",
            "ababbc, 2, 5",
    })
    void longestSubstring(String s, int k, int expected) {
        int actual = solution.longestSubstring(s, k);
        Assertions.assertEquals(expected, actual);
    }
}
