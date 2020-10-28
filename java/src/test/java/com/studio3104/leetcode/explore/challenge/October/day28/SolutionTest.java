package com.studio3104.leetcode.explore.challenge.October.day28;

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
                Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")),
                Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, List.of("0", "2->4", "6", "8->9")),
                Arguments.of(new int[]{}, List.of()),
                Arguments.of(new int[]{-1}, List.of("-1")),
                Arguments.of(new int[]{0}, List.of("0"))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void summaryRanges(int[] nums, List<String> expected) {
        List<String> result = solution.summaryRanges(nums);
        Assertions.assertEquals(expected, result);
    }
}
