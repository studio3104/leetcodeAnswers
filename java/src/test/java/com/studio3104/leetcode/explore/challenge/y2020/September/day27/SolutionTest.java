package com.studio3104.leetcode.explore.challenge.y2020.September.day27;

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
                        List.of(List.of("a", "b"), List.of("b", "c")),
                        new double[]{2.0, 3.0},
                        List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x")),
                        new double[]{6.00000, 0.50000, -1.00000, 1.00000, -1.00000}
                ),
                Arguments.of(
                        List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd")),
                        new double[]{1.5, 2.5, 5.0},
                        List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc")),
                        new double[]{3.75000, 0.40000, 5.00000, 0.20000}
                ),
                Arguments.of(
                        List.of(List.of("a", "b")),
                        new double[]{0.5},
                        List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y")),
                        new double[]{0.50000, 2.00000, -1.00000, -1.00000}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries, double[] expected) {
        double[] result = solution.calcEquation(equations, values, queries);
        Assertions.assertArrayEquals(expected, result);
    }
}
