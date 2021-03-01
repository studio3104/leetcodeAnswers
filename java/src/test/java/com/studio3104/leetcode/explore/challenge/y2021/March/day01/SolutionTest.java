package com.studio3104.leetcode.explore.challenge.y2021.March.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2, 2, 3, 3}, 3),
                Arguments.of(new int[]{1, 1, 2, 3}, 2),
                Arguments.of(new int[]{6, 6, 6, 6}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void distributeCandies(int[] candyType, int expected) {
        Solution solution = new Solution();
        int actual = solution.distributeCandies(candyType);
        Assertions.assertEquals(expected, actual);
    }
}
