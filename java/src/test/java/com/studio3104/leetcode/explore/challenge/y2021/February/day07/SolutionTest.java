package com.studio3104.leetcode.explore.challenge.y2021.February.day07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        "loveleetcode", 'e',
                        new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}
                ),
                Arguments.of(
                        "aaab", 'b',
                        new int[]{3, 2, 1, 0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shortestToChar(String s, char c, int[] expected) {
        Solution solution = new Solution();
        int[] actual = solution.shortestToChar(s, c);
        Assertions.assertArrayEquals(expected, actual);
    }
}
