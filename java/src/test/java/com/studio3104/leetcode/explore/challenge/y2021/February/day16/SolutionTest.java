package com.studio3104.leetcode.explore.challenge.y2021.February.day16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SolutionTest {
    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("a1b2", List.of("a1b2", "a1B2", "A1b2", "A1B2")),
                Arguments.of("3z4", List.of("3z4", "3Z4")),
                Arguments.of("12345", List.of("12345")),
                Arguments.of("0", List.of("0"))
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void letterCasePermutation(String S, List<String> expected) {
        Solution solution = new Solution();
        List<String> actual = solution.letterCasePermutation(S);
        Assertions.assertEquals(
                expected.stream().sorted().collect(Collectors.toList()),
                actual.stream().sorted().collect(Collectors.toList())
        );
    }
}
