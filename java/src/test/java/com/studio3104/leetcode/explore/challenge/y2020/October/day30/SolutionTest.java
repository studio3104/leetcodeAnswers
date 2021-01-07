package com.studio3104.leetcode.explore.challenge.y2020.October.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 4, 7}, 2),
                Arguments.of(new int[]{2, 2, 2, 2, 2}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findNumberOfLIS(int[] nums, int expected) {
        int actual = solution.findNumberOfLIS(nums);
        Assertions.assertEquals(expected, actual);
    }
}
