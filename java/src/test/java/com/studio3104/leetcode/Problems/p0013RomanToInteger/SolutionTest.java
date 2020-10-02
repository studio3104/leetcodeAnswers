package com.studio3104.leetcode.Problems.p0013RomanToInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "III, 3",
            "IV, 4",
            "IX, 9",
            "LVIII, 58",
            "MCMXCIV, 1994"
    })
    void romanToInt(String s, int expected) {
        int result = solution.romanToInt(s);
        Assertions.assertEquals(expected, result);
    }
}
