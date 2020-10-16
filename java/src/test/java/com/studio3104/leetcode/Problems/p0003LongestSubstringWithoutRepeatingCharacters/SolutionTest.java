package com.studio3104.leetcode.Problems.p0003LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            "aab, 2",
            "dvdf, 3",
            "asjrgapa, 6",
            "tmmzuxt, 5",
            "bbtablud, 6",
    })
    void lengthOfLongestSubstring(String s, int expected) {
        int result = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(expected, result);
    }
}
