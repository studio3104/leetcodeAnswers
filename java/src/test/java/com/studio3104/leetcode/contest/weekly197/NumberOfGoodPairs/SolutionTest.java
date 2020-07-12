package com.studio3104.leetcode.contest.weekly197.NumberOfGoodPairs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1, 1, 3}, 4),
                Arguments.of(new int[]{1, 1, 1, 1}, 6),
                Arguments.of(new int[]{1, 2, 3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numIdenticalPairs(int[] nums, int expected) {
        int result = solution.numIdenticalPairs(nums);
        Assertions.assertEquals(expected, result);
    }
}