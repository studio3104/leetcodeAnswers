package com.studio3104.leetcode.explore.collection.easy.dp.ClimbingStairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1, 1", "2, 2", "3, 3", "45, 1836311903"
    })
    void climbStairs(int n, int expected) {
        int result = solution.climbStairs(n);
        Assertions.assertEquals(expected, result);
    }
}
