package com.studio3104.leetcode.explore.interview.amazon.Others.ReverseInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "0, 0",
            "1534236469, 0",
            "-2147483412, -2143847412",
            "-2147483648, 0",
    })
    void reverse(int x, int expected) {
        int result = solution.reverse(x);
        Assertions.assertEquals(expected, result);
    }
}
