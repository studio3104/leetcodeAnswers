package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.StringToInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("   -42", -42),
                Arguments.of("4193 with words", 4193),
                Arguments.of("words and 987", 0),
                Arguments.of("-91283472332", -2147483648),
                Arguments.of(" ", 0),
                Arguments.of("2147483648", 2147483647)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void myAtoi(String str, int expected) {
        int result = solution.myAtoi(str);
        Assertions.assertEquals(expected, result);
    }
}
