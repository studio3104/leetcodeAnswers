package com.studio3104.leetcode.Problems.p0771JewelsAndStones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "aA, aAAbbbb, 3",
            "z, ZZ, 0",
    })
    void numJewelsInStones(String J, String S, int expected) {
        int result = solution.numJewelsInStones(J, S);
        Assertions.assertEquals(expected, result);
    }
}
