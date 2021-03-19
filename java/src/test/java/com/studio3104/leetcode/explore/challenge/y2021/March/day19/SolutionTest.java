package com.studio3104.leetcode.explore.challenge.y2021.March.day19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(List.of(List.of(1), List.of(2), List.of(3), List.of()), true),
                Arguments.of(List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0)), false)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void canVisitAllRooms(List<List<Integer>> rooms, boolean expected) {
        Solution solution = new Solution();
        boolean actual = solution.canVisitAllRooms(rooms);
        Assertions.assertEquals(expected, actual);
    }
}
