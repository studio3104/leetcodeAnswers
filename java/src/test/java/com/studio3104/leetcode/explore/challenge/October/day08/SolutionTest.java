package com.studio3104.leetcode.explore.challenge.October.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void search(int[] nums, int target, int expected) {
        int result = solution.search(nums, target);
        Assertions.assertEquals(expected, result);
    }
}
