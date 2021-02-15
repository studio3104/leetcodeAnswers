package com.studio3104.leetcode.explore.challenge.y2021.February.week3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 3, 10, 5), List.of(3, 0, 5, 3), 5, List.of(5, 10))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void killProcess(List<Integer> pid, List<Integer> ppid, int kill, List<Integer> expected) {
        Solution solution = new Solution();
        List<Integer> actual = solution.killProcess(pid, ppid, kill);
        Assertions.assertEquals(expected, actual);
    }
}
