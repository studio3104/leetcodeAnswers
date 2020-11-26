package com.studio3104.leetcode.explore.challenge.November.day25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, -1",
            "3, 3",
    })
    void smallestRepunitDivByK(int K, int expected) {
        int actual = solution.smallestRepunitDivByK(K);
        Assertions.assertEquals(expected, actual);
    }
}
