package com.studio3104.leetcode.explore.challenge.y2020.August.day12;

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
                Arguments.of(3, List.of(1, 3, 3, 1)),
                Arguments.of(
                        30,
                        List.of(1, 30, 435, 4060, 27405, 142506, 593775, 2035800, 5852925, 14307150, 30045015, 54627300, 86493225, 119759850, 145422675, 155117520, 145422675, 119759850, 86493225, 54627300, 30045015, 14307150, 5852925, 2035800, 593775, 142506, 27405, 4060, 435, 30, 1)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getRow(int rowIndex, List<Integer> expected) {
        List<Integer> result = solution.getRow(rowIndex);
        Assertions.assertEquals(expected, result);
    }
}
