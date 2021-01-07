package com.studio3104.leetcode.explore.challenge.y2020.November.week2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60, 58),
                Arguments.of(new int[]{10, 20, 30}, 15, -1),
                Arguments.of(new int[]{254, 914, 110, 900, 147, 441, 209, 122, 571, 942, 136, 350, 160, 127, 178, 839, 201, 386, 462, 45, 735, 467, 153, 415, 875, 282, 204, 534, 639, 994, 284, 320, 865, 468, 1, 838, 275, 370, 295, 574, 309, 268, 415, 385, 786, 62, 359, 78, 854, 944}, 200, 198)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void twoSumLessThanK(int[] A, int K, int expected) {
        int actual = solution.twoSumLessThanK(A, K);
        Assertions.assertEquals(expected, actual);
    }
}
