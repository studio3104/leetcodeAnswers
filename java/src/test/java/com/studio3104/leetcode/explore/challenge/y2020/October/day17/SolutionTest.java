package com.studio3104.leetcode.explore.challenge.y2020.October.day17;

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
                Arguments.of("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT", List.of("AAAAACCCCC", "CCCCCAAAAA")),
                Arguments.of("AAAAAAAAAAAAA", List.of("AAAAAAAAAA")),
                Arguments.of("AAAAAAAAAAA", List.of("AAAAAAAAAA")),
                Arguments.of("GAGAGAGAGAGA", List.of("GAGAGAGAGA")),
                Arguments.of("CAAAAAAAAAC", List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void findRepeatedDnaSequences(String s, List<String> expected) {
        List<String> result = solution.findRepeatedDnaSequences(s);
        Assertions.assertEquals(expected, result);
    }
}
