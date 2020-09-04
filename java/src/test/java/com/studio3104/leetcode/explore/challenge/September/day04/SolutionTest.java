package com.studio3104.leetcode.explore.challenge.September.day04;

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
                Arguments.of("ababcbacadefegdehijhklij", List.of(9, 7, 8)),
                Arguments.of("qiejxqfnqceocmy", List.of(13, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void partitionLabels(String S, List<Integer> expected) {
        List<Integer> result = solution.partitionLabels(S);
        Assertions.assertEquals(expected, result);
    }
}
