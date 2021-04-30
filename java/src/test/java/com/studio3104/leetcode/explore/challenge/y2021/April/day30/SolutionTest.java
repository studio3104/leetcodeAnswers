package com.studio3104.leetcode.explore.challenge.y2021.April.day30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(2, 3, 10, List.of(2, 3, 4, 5, 7, 9, 10)),
                Arguments.of(3, 5, 15, List.of(2, 4, 6, 8, 10, 14))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void powerfulIntegers(int x, int y, int bound, List<Integer> expected) {
        Solution solution = new Solution();
        List<Integer> actual = solution.powerfulIntegers(x, y, bound);
        Assertions.assertEquals(expected, actual);
    }
}
