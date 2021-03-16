package com.studio3104.leetcode.explore.challenge.y2021.March.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 8, 4, 9}, 2, 8),
                Arguments.of(new int[]{1, 3, 7, 5, 10, 3}, 3, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxProfit(int[] prices, int fee, int expected) {
        Solution solution = new Solution();
        int actual = solution.maxProfit(prices, fee);
        Assertions.assertEquals(expected, actual);
    }
}
