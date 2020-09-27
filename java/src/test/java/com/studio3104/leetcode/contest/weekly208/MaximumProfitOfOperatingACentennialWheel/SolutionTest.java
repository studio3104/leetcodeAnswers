package com.studio3104.leetcode.contest.weekly208.MaximumProfitOfOperatingACentennialWheel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{8, 3}, 5, 6, 3),
                Arguments.of(new int[]{10, 9, 6}, 6, 4, 7),
                Arguments.of(new int[]{3, 4, 0, 5, 1}, 1, 92, -1),
                Arguments.of(new int[]{10, 10, 6, 4, 7}, 3, 8, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost, int expected) {
        int result = solution.minOperationsMaxProfit(customers, boardingCost, runningCost);
        Assertions.assertEquals(expected, result);
    }
}
