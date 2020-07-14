package com.studio3104.leetcode.explore.interview.amazon.ArraysAndStrings.ContainerWithMostWater;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{1, 2, 4, 3}, 4),
                Arguments.of(new int[]{2, 3, 4, 5, 18, 17, 6}, 17),
                Arguments.of(new int[]{1, 3, 2, 5, 25, 24, 5}, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxArea(int[] height, int expected) {
        int result = solution.maxArea(height);
        Assertions.assertEquals(expected, result);
    }
}
