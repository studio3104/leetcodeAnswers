package com.studio3104.leetcode.explore.challenge.y2020.December.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{30, 20, 150, 100, 40}, 3),
                Arguments.of(new int[]{60, 60, 60}, 3),
                Arguments.of(new int[]{439, 407, 197, 191, 291, 486, 30, 307, 11}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numPairsDivisibleBy60(int[] time, int expected) {
        int actual = solution.numPairsDivisibleBy60(time);
        Assertions.assertEquals(expected, actual);
    }
}
