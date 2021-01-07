package com.studio3104.leetcode.explore.challenge.y2020.September.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 0}, 3),
                Arguments.of(new int[]{3, 4, -1, 1}, 2),
                Arguments.of(new int[]{7, 8, 9, 11, 12}, 1),
                Arguments.of(new int[]{Integer.MAX_VALUE}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void firstMissingPositive(int[] nums, int expected) {
        int result = solution.firstMissingPositive(nums);
        Assertions.assertEquals(expected, result);
    }
}
