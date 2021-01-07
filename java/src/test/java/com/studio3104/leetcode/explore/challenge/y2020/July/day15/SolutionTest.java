package com.studio3104.leetcode.explore.challenge.y2020.July.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("the sky is blue", "blue is sky the"),
                Arguments.of("  hello world!  ", "world! hello"),
                Arguments.of("a good   example", "example good a")
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void reverseWords(String s, String expected) {
        String result = solution.reverseWords(s);
        Assertions.assertEquals(expected, result);
    }
}
