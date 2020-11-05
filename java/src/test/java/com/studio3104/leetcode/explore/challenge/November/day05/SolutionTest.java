package com.studio3104.leetcode.explore.challenge.November.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 1),
                Arguments.of(new int[]{2, 2, 2, 3, 3}, 2),
                Arguments.of(new int[]{1, 1000000000}, 1),
                Arguments.of(new int[]{3, 3, 1, 2, 2}, 2),
                Arguments.of(new int[]{6, 4, 7, 8, 2, 10, 2, 7, 9, 7}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minCostToMoveChips(int[] position, int expected) {
        int actual = solution.minCostToMoveChips(position);
        Assertions.assertEquals(expected, actual);
    }
}
