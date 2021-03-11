package com.studio3104.leetcode.explore.challenge.y2021.March.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 5}, 11, 3),
                Arguments.of(new int[]{2}, 3, -1),
                Arguments.of(new int[]{1}, 0, 0),
                Arguments.of(new int[]{1}, 1, 1),
                Arguments.of(new int[]{1}, 2, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void coinChange(int[] coins, int amount, int expected) {
        Solution solution = new Solution();
        int actual = solution.coinChange(coins, amount);
        Assertions.assertEquals(expected, actual);
    }
}
