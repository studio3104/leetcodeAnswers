package com.studio3104.leetcode.explore.challenge.December.week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "eceba, 2, 3",
            "aa, 1, 2",
    })
    void lengthOfLongestSubstringKDistinct(String s, int k, int expected) {
        int actual = solution.lengthOfLongestSubstringKDistinct(s, k);
        Assertions.assertEquals(expected, actual);
    }
}
