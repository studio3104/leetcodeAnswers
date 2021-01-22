package com.studio3104.leetcode.explore.challenge.y2021.January.day21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 2, 6}, 2, new int[]{2, 6}),
                Arguments.of(new int[]{2, 4, 3, 3, 5, 4, 9, 6}, 4, new int[]{2, 3, 3, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void mostCompetitive(int[] nums, int k, int[] expected) {
        Solution solution = new Solution();
        Assertions.assertArrayEquals(expected, solution.mostCompetitive(nums, k));
    }
}