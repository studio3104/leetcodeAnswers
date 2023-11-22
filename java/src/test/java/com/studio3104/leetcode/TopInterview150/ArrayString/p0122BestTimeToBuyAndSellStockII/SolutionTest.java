package com.studio3104.leetcode.TopInterview150.ArrayString.p0122BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{7, 1, 5, 3, 6, 4}, 7),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void removeElement(int[] prices, int expected) {
        int result = solution.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }

}