package com.studio3104.leetcode.explore.challenge.y2020.July.day28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2, 8),
                Arguments.of(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0, 6),
                Arguments.of(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2, 16),
                Arguments.of(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'C'}, 2, 11),
                Arguments.of(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'C', 'D'}, 2, 12),
                Arguments.of(new char[]{'A', 'A', 'A', 'A', 'B', 'B', 'B', 'C', 'C', 'C', 'C', 'D', 'E'}, 2, 13),
                Arguments.of(
                        new char[]{
                                'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E', 'F', 'F', 'G', 'G', 'H', 'H',
                                'I', 'I', 'J', 'J', 'K', 'K', 'L', 'L', 'M', 'M', 'N', 'N', 'O', 'O', 'P', 'P',
                                'Q', 'Q', 'R', 'R', 'S', 'S', 'T', 'T', 'U', 'U', 'V', 'V', 'W', 'W', 'X', 'X',
                                'Y', 'Y', 'Z', 'Z'
                        }, 2, 52
                )
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void leastInterval(char[] tasks, int n, int expected) {
        int result = solution.leastInterval(tasks, n);
        Assertions.assertEquals(expected, result);
    }
}
