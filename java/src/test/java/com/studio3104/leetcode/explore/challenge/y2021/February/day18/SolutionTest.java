package com.studio3104.leetcode.explore.challenge.y2021.February.day18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 7, 9}, 6),
                Arguments.of(new int[]{7, 7, 7, 7}, 3),
                Arguments.of(new int[]{3, -1, -5, -9}, 3),
                Arguments.of(new int[]{1, 1, 2, 5, 7}, 0),
                Arguments.of(new int[]{1, 2, 3, 4}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numberOfArithmeticSlices(int[] A, int expected) {
        Solution solution = new Solution();
        int actual = solution.numberOfArithmeticSlices(A);
        Assertions.assertEquals(expected, actual);
    }
}
