package com.studio3104.leetcode.explore.challenge.y2021.April.week5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[][]{{10, 50}, {60, 120}, {140, 210}}, new int[][]{{0, 15}, {60, 70}}, 8, List.of(60, 68)),
                Arguments.of(new int[][]{{10, 50}, {60, 120}, {140, 210}}, new int[][]{{0, 15}, {60, 70}}, 12, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void minAvailableDuration(int[][] slots1, int[][] slots2, int duration, List<Integer> expected) {
        Solution solution = new Solution();
        List<Integer> actual = solution.minAvailableDuration(slots1, slots2, duration);
        Assertions.assertEquals(expected, actual);
    }
}
