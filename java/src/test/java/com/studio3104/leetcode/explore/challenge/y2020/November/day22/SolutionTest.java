package com.studio3104.leetcode.explore.challenge.y2020.November.day22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    Solution solution = new Solution();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"gin", "zen", "gig", "msg"}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void uniqueMorseRepresentations(String[] words, int expected) {
        int actual = solution.uniqueMorseRepresentations(words);
        Assertions.assertEquals(expected, actual);
    }
}
