package com.studio3104.leetcode.explore.challenge.y2020.November.day28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3, new int[]{3, 3, 5, 5, 6, 7}),
                Arguments.of(new int[]{1}, 1, new int[]{1}),
                Arguments.of(new int[]{1, -1}, 1, new int[]{1, -1}),
                Arguments.of(new int[]{9, 11}, 2, new int[]{11}),
                Arguments.of(new int[]{4, -2}, 2, new int[]{4}),
                Arguments.of(new int[]{1, 3, 1, 2, 0, 5}, 3, new int[]{3, 3, 2, 5}),
                Arguments.of(new int[]{9, 10, 9, -7, -4, -8, 2, -6}, 5, new int[]{10, 10, 9, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxSlidingWindow(int[] nums, int k, int[] expected) {
        int[] actual = solution.maxSlidingWindow(nums, k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
