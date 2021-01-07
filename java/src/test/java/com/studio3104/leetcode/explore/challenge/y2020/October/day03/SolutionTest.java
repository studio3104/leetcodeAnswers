package com.studio3104.leetcode.explore.challenge.y2020.October.day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 4, 1, 5}, 2, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 1, 4),
                Arguments.of(new int[]{1, 3, 1, 5, 4}, 0, 1),
                Arguments.of(new int[]{1, 2, 4, 4, 3, 3, 0, 9, 2, 3}, 3, 2),
                Arguments.of(new int[]{-1, -2, -3}, 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findPairs(int[] nums, int k, int expected) {
        int result = solution.findPairs(nums, k);
        Assertions.assertEquals(expected, result);
    }
}
