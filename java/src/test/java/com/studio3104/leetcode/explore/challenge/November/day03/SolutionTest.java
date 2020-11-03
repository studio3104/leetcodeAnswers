package com.studio3104.leetcode.explore.challenge.November.day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "leetcode, 2",
            "abbcccddddeeeeedcba, 5",
            "triplepillooooow, 5",
            "hooraaaaaaaaaaay, 11",
            "tourist, 1",
    })
    void maxPower(String s, int expected) {
        int actual = solution.maxPower(s);
        Assertions.assertEquals(expected, actual);
    }
}
