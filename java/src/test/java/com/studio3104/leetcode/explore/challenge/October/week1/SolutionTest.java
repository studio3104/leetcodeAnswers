package com.studio3104.leetcode.explore.challenge.October.week1;

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
                Arguments.of(
                        List.of(
                                List.of(1, 2, 3),
                                List.of(4, 5),
                                List.of(1, 2, 3)
                        ),
                        4
                ),
                Arguments.of(
                        List.of(
                                List.of(-1, 1),
                                List.of(-3, 1, 4),
                                List.of(-2, -1, 0, 2)
                        ),
                        6
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void maxDistance(List<List<Integer>> arrays, int expected) {
        int result = solution.maxDistance(arrays);
        Assertions.assertEquals(expected, result);
    }
}
