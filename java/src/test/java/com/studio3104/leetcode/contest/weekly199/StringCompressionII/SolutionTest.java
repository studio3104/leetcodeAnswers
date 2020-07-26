package com.studio3104.leetcode.contest.weekly199.StringCompressionII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "aaabcccd, 2, 4",
            "aabbaa, 2, 2",
            "aaaaaaaaaaa, 0, 3"
    })
    void getLengthOfOptimalCompression(String s, int k, int expected) {
        int result = solution.getLengthOfOptimalCompression(s, k);
        Assertions.assertEquals(expected, result);
    }
}
