package com.studio3104.leetcode.explore.challenge.y2020.October.day02;

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
                Arguments.of(new int[]{2, 3, 6, 7}, 7, List.of(List.of(2, 2, 3), List.of(7))),
                Arguments.of(new int[]{2, 3, 5}, 8, List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5))),
                Arguments.of(new int[]{2}, 1, List.of()),
                Arguments.of(new int[]{1}, 1, List.of(List.of(1))),
                Arguments.of(new int[]{1}, 2, List.of(List.of(1, 1)))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void combinationSum(int[] candidates, int target, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        Assertions.assertEquals(expected, result);
    }
}
