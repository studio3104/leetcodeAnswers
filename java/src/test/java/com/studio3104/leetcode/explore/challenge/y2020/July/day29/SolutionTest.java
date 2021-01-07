package com.studio3104.leetcode.explore.challenge.y2020.July.day29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 0, 2}, 3),
                Arguments.of(new int[]{5, 2, 3, 0, 2, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxProfit(int[] prices, int expexted) {
        int result = solution.maxProfit(prices);
        Assertions.assertEquals(expexted, result);
    }
}
