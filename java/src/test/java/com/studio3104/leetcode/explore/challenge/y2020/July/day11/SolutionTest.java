package com.studio3104.leetcode.explore.challenge.y2020.July.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2, 3},
                        List.of(
                                List.of(3), List.of(2), List.of(1), List.of(),
                                List.of(1, 3), List.of(2, 3), List.of(1, 2),
                                List.of(1, 2, 3)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void subsets(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.subsets(nums);
        Assertions.assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }
}