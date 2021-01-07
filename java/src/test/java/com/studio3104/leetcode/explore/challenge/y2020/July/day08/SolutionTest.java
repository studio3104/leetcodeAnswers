package com.studio3104.leetcode.explore.challenge.y2020.July.day08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{-1, 0, 1, 2, -1, -4},
                        List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))
                ),
                Arguments.of(
                        new int[]{-2, 0, 0, 2, 2},
                        List.of(List.of(-2, 0, 2))
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void threeSum(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.threeSum(nums);
        Assertions.assertEquals(expected, result);
    }
}
