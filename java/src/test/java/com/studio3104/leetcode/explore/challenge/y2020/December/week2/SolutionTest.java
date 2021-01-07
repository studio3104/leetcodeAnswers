package com.studio3104.leetcode.explore.challenge.y2020.December.week2;

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
                Arguments.of(new int[]{0, 1, 3, 50, 75}, 0, 99, List.of("2", "4->49", "51->74", "76->99")),
                Arguments.of(new int[]{}, 1, 1, List.of("1")),
                Arguments.of(new int[]{}, -3, -1, List.of("-3->-1")),
                Arguments.of(new int[]{-1}, -1, -1, List.of()),
                Arguments.of(new int[]{-1}, -2, -1, List.of("-2"))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findMissingRanges(int[] nums, int lower, int upper, List<String> expected) {
        List<String> actual = solution.findMissingRanges(nums, lower, upper);
        Assertions.assertEquals(expected, actual);
    }
}
