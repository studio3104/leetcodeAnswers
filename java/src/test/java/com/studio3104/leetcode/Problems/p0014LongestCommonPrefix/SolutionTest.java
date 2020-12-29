package com.studio3104.leetcode.Problems.p0014LongestCommonPrefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"flower", "flow", "flight"}, "fl"),
                Arguments.of(new String[]{"dog", "racecar", "car"}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void longestCommonPrefix(String[] strings, String expected) {
        String actual = solution.longestCommonPrefix(strings);
        Assertions.assertEquals(expected, actual);
    }
}
