package com.studio3104.leetcode.Problems.p0273IntegerToEnglishWords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "123, One Hundred Twenty Three",
            "12345, Twelve Thousand Three Hundred Forty Five",
            "1234567, One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
            "1234567891, One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One",
    })
    void numberToWords(int num, String expected) {
        String result = solution.numberToWords(num);
        Assertions.assertEquals(expected, result);
    }
}
