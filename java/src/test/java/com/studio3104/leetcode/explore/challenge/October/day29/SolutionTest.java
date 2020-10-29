package com.studio3104.leetcode.explore.challenge.October.day29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1, 0, 1}, 2),
                Arguments.of(new int[]{1, 0, 0, 0}, 3),
                Arguments.of(new int[]{0, 1}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxDistToClosest(int[] seats, int expected) {
        int actual = solution.maxDistToClosest(seats);
        Assertions.assertEquals(expected, actual);
    }
}
