package com.studio3104.leetcode.contest.weekly199.BulbSwitcherIV;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "10111, 3", "101, 3", "00000, 0", "001011101, 5"
    })
    void minFlips(String target, int expected) {
        int result = solution.minFlips(target);
        Assertions.assertEquals(expected, result);
    }
}
