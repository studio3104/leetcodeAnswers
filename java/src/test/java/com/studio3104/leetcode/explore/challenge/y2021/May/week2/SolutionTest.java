package com.studio3104.leetcode.explore.challenge.y2021.May.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 4, 1}, new int[]{5, 3, 3, 4, 1}, 3),
                Arguments.of(new int[]{1, 2, 2, 3, 4}, new int[]{3, 4, 1, 2}, 3),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4}, 1),
                Arguments.of(new int[]{4, 5, 6}, new int[]{3, 3, 3, 3, 3}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxBoxesInWarehouse(int[] boxes, int[] warehouse, int expected) {
        Solution solution = new Solution();
        int actual = solution.maxBoxesInWarehouse(boxes, warehouse);
        Assertions.assertEquals(expected, actual);
    }
}
