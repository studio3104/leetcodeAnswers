package com.studio3104.leetcode.explore.challenge.December.day05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 1, true),
                Arguments.of(new int[]{1, 0, 0, 0, 1}, 2, false),
                Arguments.of(new int[]{1, 0, 0, 0, 0, 0, 1}, 2, true),
                Arguments.of(new int[]{0, 0, 0, 0, 0, 1, 0, 0}, 0, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        boolean actual = solution.canPlaceFlowers(flowerbed, n);
        Assertions.assertEquals(expected, actual);
    }
}
