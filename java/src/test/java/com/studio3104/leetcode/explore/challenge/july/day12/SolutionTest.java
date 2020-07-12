package com.studio3104.leetcode.explore.challenge.july.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "00000010100101000001111010011100, 00111001011110000010100101000000",
            "11111111111111111111111111111101, 10111111111111111111111111111111",
    })
    void reverseBits(String nBinary, String expectedBinary) {
        int result = solution.reverseBits((int) Long.parseLong(nBinary, 2));
        Assertions.assertEquals((int) Long.parseLong(expectedBinary, 2), result);
    }
}
