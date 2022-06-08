package com.studio3104.leetcode.explore.collection.easy.array.BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class Solution2Test extends SolutionTest {
    Solution2 solution = new Solution2();

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxProfit(int[] prices, int expected) {
        int result = solution.maxProfit(prices);
        Assertions.assertEquals(expected, result);
    }
}
