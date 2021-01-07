package com.studio3104.leetcode.explore.challenge.y2020.September.day14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, 4),
                Arguments.of(new int[]{2, 7, 9, 3, 1}, 12)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void rob(int[] nums, int expected) {
        int result = solution.rob(nums);
        Assertions.assertEquals(expected, result);
    }
}
