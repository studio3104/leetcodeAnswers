package com.studio3104.leetcode.explore.challenge.September.day12;

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
                Arguments.of(3, 7, List.of(List.of(1, 2, 4))),
                Arguments.of(3, 24, List.of(List.of(7, 8, 9))),
                Arguments.of(
                        3, 9,
                        List.of(
                                List.of(1, 2, 6),
                                List.of(1, 3, 5),
                                List.of(2, 3, 4)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void combinationSum3(int k, int n, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.combinationSum3(k, n);
        Assertions.assertEquals(expected, result);
    }
}
