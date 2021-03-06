package com.studio3104.leetcode.Problems.BestTimeToBuyAndSellStock.p3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
//                Arguments.of(new int[]{3, 3, 5, 0, 0, 3, 1, 4}, 6),
//                Arguments.of(new int[]{1, 2, 3, 4, 5}, 4),
//                Arguments.of(new int[]{7, 6, 4, 3, 1}, 0),
//                Arguments.of(new int[]{1, 4, 2}, 3),
                Arguments.of(new int[]{8, 3, 6, 2, 8, 8, 8, 4, 2, 0, 7, 2, 9, 4, 9}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxProfit(int[] prices, int expected) {
        int result = solution.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }
}