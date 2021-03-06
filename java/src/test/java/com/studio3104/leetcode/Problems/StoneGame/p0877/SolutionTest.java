package com.studio3104.leetcode.Problems.StoneGame.p0877;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{5, 3, 4, 5}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void stoneGame(int[] piles, boolean expected) {
        boolean result = solution.stoneGame(piles);
        Assertions.assertEquals(expected, result);
    }
}
