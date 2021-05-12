package com.studio3104.leetcode.explore.challenge.y2021.May.day12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumMatrixTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(
                        new int[][]{
                                {3, 0, 1, 4, 2},
                                {5, 6, 3, 2, 1},
                                {1, 2, 0, 1, 5},
                                {4, 1, 0, 1, 7},
                                {1, 0, 3, 0, 5}
                        },
                        new int[][]{{2, 1, 4, 3}, {1, 1, 2, 2}, {1, 2, 2, 4}},
                        new int[]{8, 11, 12}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void sumRegion(int[][] matrix, int[][] inputs, int[] expectations) {
        NumMatrix numMatrix = new NumMatrix(matrix);
        for (int i = 0; i < inputs.length; ++i) {
            int[] input = inputs[i];
            int actual = numMatrix.sumRegion(input[0], input[1], input[2], input[3]);
            Assertions.assertEquals(expectations[i], actual);
        }
    }
}
