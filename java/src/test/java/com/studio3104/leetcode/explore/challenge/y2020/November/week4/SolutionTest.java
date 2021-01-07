package com.studio3104.leetcode.explore.challenge.y2020.November.week4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "eceba, 3",
            "ccaabbb, 5",
    })
    void lengthOfLongestSubstringTwoDistinct(String s, int expected) {
        int actual = solution.lengthOfLongestSubstringTwoDistinct(s);
        Assertions.assertEquals(expected, actual);
    }
}
