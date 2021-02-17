package com.studio3104.leetcode.explore.collection.medium2.ArrayAndStrings.LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
    })
    void lengthOfLongestSubstring(String s, int expected) {
        Solution solution = new Solution();
        int actual = solution.lengthOfLongestSubstring(s);
        Assertions.assertEquals(expected, actual);
    }
}
