package com.studio3104.leetcode.explore.challenge.y2021.January.day13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, 3, 1),
                Arguments.of(new int[]{3, 2, 2, 1}, 3, 3),
                Arguments.of(new int[]{3, 5, 3, 4}, 5, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void numRescueBoats(int[] people, int limit, int expected) {
        Solution solution = new Solution();
        int actual = solution.numRescueBoats(people, limit);
        Assertions.assertEquals(expected, actual);
    }
}
