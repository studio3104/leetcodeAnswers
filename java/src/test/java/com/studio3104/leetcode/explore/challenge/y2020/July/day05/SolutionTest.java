package com.studio3104.leetcode.explore.challenge.y2020.July.day05;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "1, 4, 2"
    })
    void hammingDistance(int x, int y, int expected) {
        int result = solution.hammingDistance(x, y);
        assertEquals(expected, result);
    }
}
