package com.studio3104.leetcode.explore.Learn.Recursion.I.RecurrenceRelation.PascalsTriangleII;

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
                Arguments.of(0, List.of(1)),
                Arguments.of(1, List.of(1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void getRow(int rowIndex, List<Integer> expected) {
        List<Integer> actual = solution.getRow(rowIndex);
        Assertions.assertEquals(expected, actual);
    }
}
