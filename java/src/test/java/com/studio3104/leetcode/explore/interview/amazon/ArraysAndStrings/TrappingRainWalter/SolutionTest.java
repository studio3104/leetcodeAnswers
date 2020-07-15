package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.TrappingRainWalter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}, 6),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{0, 2, 0}, 0),
                Arguments.of(new int[]{2, 0, 2}, 2),
                Arguments.of(new int[]{6, 8, 5, 0, 0, 6, 5}, 13),
                Arguments.of(new int[]{6, 8, 5, 0, 0, 6, 8}, 21),
                Arguments.of(new int[]{5, 4, 1, 1, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void trap(int[] height, int expected) {
        int result = solution.trap(height);
        Assertions.assertEquals(expected, result);
    }
}