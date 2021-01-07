package com.studio3104.leetcode.explore.challenge.y2020.August.day25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}, 11),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}, 17),
                Arguments.of(new int[]{1, 4, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20, 21, 22, 23, 27, 28}, new int[]{3, 13, 45}, 44)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void mincostTickets(int[] days, int[] costs, int expected) {
        int result = solution.mincostTickets(days, costs);
        Assertions.assertEquals(expected, result);
    }
}
