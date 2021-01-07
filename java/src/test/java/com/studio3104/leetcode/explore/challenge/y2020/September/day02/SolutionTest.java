package com.studio3104.leetcode.explore.challenge.y2020.September.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 3, 0, true),
                Arguments.of(new int[]{1, 0, 1, 1}, 1, 2, true),
                Arguments.of(new int[]{1, 5, 9, 1, 5, 9}, 2, 3, false),
                Arguments.of(new int[]{0}, 1, 0, false),
                Arguments.of(new int[]{1, 2}, 0, 1, false),
                Arguments.of(new int[]{1, 3, 1}, 1, 1, false),
                Arguments.of(new int[]{-3, 3}, 2, 4, false),
                Arguments.of(new int[]{3, 6, 0, 4}, 2, 2, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void containsNearbyAlmostDuplicate(int[] nums, int k, int t, boolean expected) {
        boolean result = solution.containsNearbyAlmostDuplicate(nums, k, t);
        Assertions.assertEquals(expected, result);
    }
}
