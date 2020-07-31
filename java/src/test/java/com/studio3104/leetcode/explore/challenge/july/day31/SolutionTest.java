package com.studio3104.leetcode.explore.challenge.july.day31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "2, 2", "3, 3"
    })
    void climbStairs(int n, int expected) {
        int result = solution.climbStairs(n);
        Assertions.assertEquals(expected, result);
    }
}
