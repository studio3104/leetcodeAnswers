package com.studio3104.leetcode.explore.challenge.October.day23;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{3, 1, 4, 2}, true),
                Arguments.of(new int[]{-1, 3, 2, 0}, true),
                Arguments.of(new int[]{3, 5, 0, 3, 4}, true),
                Arguments.of(new int[]{-2, 1, 2, -2, 1, 2}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void find132pattern(int[] nums, boolean expected) {
        boolean result = solution.find132pattern(nums);
        Assertions.assertEquals(expected, result);
    }
}
