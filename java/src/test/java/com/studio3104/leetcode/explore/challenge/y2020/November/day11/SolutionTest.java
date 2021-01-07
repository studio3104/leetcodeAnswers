package com.studio3104.leetcode.explore.challenge.y2020.November.day11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{0, 0}, new int[]{1, 1}, new int[]{1, 0}, new int[]{0, 1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void validSquare(int[] p1, int[] p2, int[] p3, int[] p4, boolean expected) {
        boolean actual = solution.validSquare(p1, p2, p3, p4);
        Assertions.assertEquals(expected, actual);
    }
}
