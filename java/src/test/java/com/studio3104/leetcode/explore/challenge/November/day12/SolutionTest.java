package com.studio3104.leetcode.explore.challenge.November.day12;

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
                Arguments.of(new int[]{1, 1, 2}, List.of(
                        List.of(1, 1, 2),
                        List.of(1, 2, 1),
                        List.of(2, 1, 1)
                )),
                Arguments.of(new int[]{1, 2, 3}, List.of(
                        List.of(1, 2, 3),
                        List.of(1, 3, 2),
                        List.of(2, 1, 3),
                        List.of(2, 3, 1),
                        List.of(3, 1, 2),
                        List.of(3, 2, 1)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void permuteUnique(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = solution.permuteUnique(nums);
        Assertions.assertEquals(expected, actual);
    }
}
