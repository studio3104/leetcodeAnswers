package com.studio3104.leetcode.explore.challenge.October.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{5, 10, -5}, new int[]{5, 10}),
                Arguments.of(new int[]{8, -8}, new int[]{}),
                Arguments.of(new int[]{10, 2, -5}, new int[]{10}),
                Arguments.of(new int[]{-2, -1, 1, 2}, new int[]{-2, -1, 1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void asteroidCollision(int[] asteroids, int[] expected) {
        int[] result = solution.asteroidCollision(asteroids);
        Assertions.assertArrayEquals(expected, result);
    }
}
