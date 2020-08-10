package com.studio3104.leetcode.explore.challenge.August.day10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "A, 1",
            "AB, 28",
            "ZY, 701",
            "AAA, 703",
            "ZJALKF, 313511516"
    })
    void titleToNumber(String s, int expected) {
        int result = solution.titleToNumber(s);
        Assertions.assertEquals(expected, result);
    }
}
