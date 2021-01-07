package com.studio3104.leetcode.explore.challenge.y2020.July.day26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "38, 2"
    })
    void addDigits(int num, int expected) {
        int result = solution.addDigits(num);
        Assertions.assertEquals(expected, result);
    }
}
