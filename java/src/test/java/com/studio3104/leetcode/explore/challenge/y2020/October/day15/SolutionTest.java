package com.studio3104.leetcode.explore.challenge.y2020.October.day15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{4, 5, 6, 1, 2, 3}),
                Arguments.of(new int[]{1, 2}, 0, new int[]{1, 2}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 1, new int[]{6, 1, 2, 3, 4, 5}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{5, 6, 1, 2, 3, 4}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 4, new int[]{3, 4, 5, 6, 1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rotate(int[] nums, int k, int[] expected) {
        solution.rotate(nums, k);
        Assertions.assertArrayEquals(expected, nums);
    }
}
