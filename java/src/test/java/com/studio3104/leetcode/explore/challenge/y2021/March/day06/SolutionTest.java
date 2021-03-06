package com.studio3104.leetcode.explore.challenge.y2021.March.day06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"time", "im", "bell"}, 13),
                Arguments.of(new String[]{"time", "me", "bell"}, 10),
                Arguments.of(new String[]{"t"}, 2),
                Arguments.of(new String[]{"me", "time"}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minimumLengthEncoding(String[] words, int expected) {
        Solution solution = new Solution();
        int actual = solution.minimumLengthEncoding(words);
        Assertions.assertEquals(expected, actual);
    }
}
