package com.studio3104.leetcode.explore.challenge.December.day14;

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
                Arguments.of("aab", List.of(List.of("a", "a", "b"), List.of("aa", "b"))),
                Arguments.of("a", List.of(List.of("a")))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void partition(String s, List<List<String>> expected) {
        List<List<String>> actual = solution.partition(s);
        Assertions.assertEquals(expected, actual);
    }
}
