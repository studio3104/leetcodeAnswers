package com.studio3104.leetcode.explore.challenge.November.day27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 11, 5}, true),
                Arguments.of(new int[]{1, 2, 3, 5}, false),
                Arguments.of(new int[]{1, 5, 3}, false),
                Arguments.of(new int[]{1, 1, 2, 2}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canPartition(int[] nums, boolean expected) {
        boolean actual = solution.canPartition(nums);
        Assertions.assertEquals(expected, actual);
    }
}
