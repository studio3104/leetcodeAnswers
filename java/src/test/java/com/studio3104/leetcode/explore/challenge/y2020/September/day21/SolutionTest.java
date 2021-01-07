package com.studio3104.leetcode.explore.challenge.y2020.September.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4, false),
                Arguments.of(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5, true),
                Arguments.of(new int[][]{{2, 1, 5}, {3, 5, 7}}, 3, true),
                Arguments.of(new int[][]{{3, 2, 7}, {3, 7, 9}, {8, 3, 9}}, 11, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void carPooling(int[][] trips, int capacity, boolean expected) {
        boolean result = solution.carPooling(trips, capacity);
        Assertions.assertEquals(expected, result);
    }
}
