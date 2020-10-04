package com.studio3104.leetcode.Problems.p1086HighFive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}},
                        new int[][]{{1, 87}, {2, 88}}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void highFive(int[][] items, int[][] expected) {
        int[][] result = solution.highFive(items);
        Assertions.assertArrayEquals(expected, result);
    }
}
