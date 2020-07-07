package com.studio3104.leetcode.explore.collection.easy.string.FirstUniqueCharacterInAString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "leetcode,0",
            "loveleetcode,2",
            "z,0",
    })
    void firstUniqChar(String s, int expected) {
        int result = solution.firstUniqChar(s);
        Assertions.assertEquals(expected, result);
    }
}
