package com.studio3104.leetcode.explore.challenge.y2021.February.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "14, 6",
            "8, 4",
            "123, 12",
    })
    void numberOfSteps(int num, int expected) {
        Solution solution = new Solution();
        int actual = solution.numberOfSteps(num);
        Assertions.assertEquals(expected, actual);
    }
}
