package com.studio3104.leetcode.explore.challenge.y2021.March.day13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 4}, 3),
                Arguments.of(new int[]{2, 4, 5, 10}, 7),
                Arguments.of(new int[]{2, 4, 5, 10, 20}, 18)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numFactoredBinaryTrees(int[] arr, int expected) {
        Solution solution = new Solution();
        int actual = solution.numFactoredBinaryTrees(arr);
        Assertions.assertEquals(expected, actual);
    }
}
