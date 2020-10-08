package com.studio3104.leetcode.Problems.p0006ZigZagConversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "PAYPALISHIRING, 3, PAHNAPLSIIGYIR",
            "PAYPALISHIRING, 4, PINALSIGYAHRPI",
            "A, 1, A",
            "AB, 1, AB"
    })
    void convert(String s, int numRows, String expected) {
        String result = solution.convert(s, numRows);
        Assertions.assertEquals(expected, result);
    }
}
