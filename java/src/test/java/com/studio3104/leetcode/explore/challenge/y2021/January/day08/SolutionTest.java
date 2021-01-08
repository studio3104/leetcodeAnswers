package com.studio3104.leetcode.explore.challenge.y2021.January.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"ab", "c"}, new String[]{"a", "bc"}, true),
                Arguments.of(new String[]{"a", "cb"}, new String[]{"ab", "c"}, false),
                Arguments.of(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void arrayStringsAreEqual(String[] word1, String[] word2, boolean expected) {
        boolean actual = solution.arrayStringsAreEqual(word1, word2);
        Assertions.assertEquals(expected, actual);
    }
}
