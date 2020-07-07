package com.studio3104.leetcode.explore.collection.easy.string.ValidAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution2Test {
    Solution2 solution2 = new Solution2();

    @ParameterizedTest
    @CsvSource({
            "anagram,nagaram,true",
            "rat,cat,false"
    })
    void isAnagram(String s, String t, boolean expected) {
        boolean result = solution2.isAnagram(s, t);
        Assertions.assertEquals(expected, result);
    }
}